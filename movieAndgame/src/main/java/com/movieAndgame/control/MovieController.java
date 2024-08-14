package com.movieAndgame.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.MovieMember;
import com.movieAndgame.Service.MovieMemberService;

@Controller
@RequestMapping("/movie")

public class MovieController 
{
	@Autowired
	public MovieMemberService movieMemberService;
	
	
	// "/"은 localhost/movie의 맵핑이다.
	@GetMapping("/index")
	public String Home()
	{
		return "movie/index";
	}
	
	@GetMapping("/login")
	public String loginHome(Model model)
	{
		model.addAttribute("member", new MovieMember() );
		
		return "movie/member/login";
	}
	
	// 회원가입 페이지 제공
	@GetMapping("/signUp")
	public String signUp(Model model)
	{
		model.addAttribute("movieMember",new MovieMember() );
		return "movie/member/join";
	}
	
	//회원가입 완료 후 요쳥
	@PostMapping("signUp")
	public String signUp(@Valid MovieMember movieMember, BindingResult bindingResult, Model model )
	{
		if( bindingResult.hasErrors() )
		{
			
			
			return "movie/member/join";
		}
		
		movieMemberService.signUpSave(movieMember);
		
		return "redirect:/movie/login";
	}
	
	
}


























