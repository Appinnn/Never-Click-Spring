package com.movieAndgame.control;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.GameDto;
import com.movieAndgame.Dto.GamePostDto;
import com.movieAndgame.Service.GamePostService;

@Controller
@RequestMapping("/gamePost")
public class GamePostControl 
{
	@Autowired
	private GamePostService gamePostService;
	
	@GetMapping("/write")
	public String postWrite(@Valid GamePostDto gamePostDto, BindingResult bind,Model model )
	{
		if(bind.hasErrors() )
		{
			return "game/post/write";
		}
		gamePostService.save(gamePostDto);
		return "redirect://gamePost/m";
		
	}
	
	@GetMapping("/m")
	public String postMain(Model model)
	{
		return "game/post/index";
	}
	
	@GetMapping("/postWrite")
	public String write(Model model, HttpSession session)
	{
		if(session.getAttribute("user") == null)
		{
			return "redirect:/game/login";
		}
		GamePostDto dto = new GamePostDto();
		String name = ((GameDto)session.getAttribute("user")).getNickName();
		dto.setWriter(name);
		
		model.addAttribute("gamePostDto", dto);
		
		return "game/post/write";
	}
}
