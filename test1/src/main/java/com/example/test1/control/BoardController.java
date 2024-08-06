package com.example.test1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.DTO.boardDTO;

@Controller
public class BoardController 
{
	@GetMapping("/board")
	public ModelAndView boardHome()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardList");
		
		return mav;
	}
	
	@GetMapping("/write")
	public String write()
	{
		return "board/write";
	}
	
	@PostMapping("/write")
	public ModelAndView view(@ModelAttribute boardDTO dto)
	{
		
		String savetitle = dto.getTitle();
		String savewriter = dto.getWriter();
		String savecontent = dto.getContent();
		String savepw = dto.getBoardPw();
		ModelAndView mav = new ModelAndView("board/view");
		mav.addObject("saveTitle", savetitle);
		mav.addObject("saveWriter", savewriter);
		mav.addObject("saveContent", savecontent);
		mav.addObject("savePw", savepw);
		
		return mav;
	}
	
	
	
	
}
