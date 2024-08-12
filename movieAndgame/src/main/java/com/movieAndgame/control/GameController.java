package com.movieAndgame.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.GameDto;

@Controller
@RequestMapping("/game")
public class GameController 
{
	@GetMapping("/index")
	public String gameHome()
	{
		return "game/index";
	}
	
	@GetMapping("/login")
	public String gameLogin(Model model)
	{
		model.addAttribute("gameMember", new GameDto() );
		
		return "game/member/login";
	}
}
