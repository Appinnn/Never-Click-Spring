package com.movieAndgame.control;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.GameDto;
import com.movieAndgame.Service.GameService;

@Controller
@RequestMapping("/game")
public class GameController 
{
	@Autowired
	public GameService gameService;
	
	@GetMapping("/index")
	public String gameHome()
	{
		return "game/index";
	}
	
	@GetMapping("/login")
	public String gameLogin(Model model)
	{
		model.addAttribute("gameDto", new GameDto() );
		
		return "game/member/login";
	}
	
	@GetMapping("/signUp")
	public String gameSignUp(Model model)
	{
		model.addAttribute("gameDto", new GameDto() );
		return "game/member/register";
	}
	
	@PostMapping("/signUp")
	public String signUp(@Valid GameDto gameDto, BindingResult br ,Model model)
	{
		if(br.hasErrors() )
		{
			return "game/member/register";
		}
		
		boolean isDup = gameService.registerDataSave(gameDto);
		if(isDup == true)
		{
			br.rejectValue("email", "error.email", "중복된 이메일이 있습니다.");
			return "/game/member/register";
		}
		
		return "game/member/login";
	}
	
	@PostMapping("/signIn")
	public String signIn(GameDto gameDto, HttpSession session, Model model)
	{
		GameDto user = gameService.login(gameDto);
		if(user == null)
		{
			model.addAttribute("gameDto", gameDto);
			model.addAttribute("fail", "a");
			return "game/member/login";
		}
		session.setAttribute("user", user);
		
		return "redirect:/game/index";
	}
	
}










