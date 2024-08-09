package com.example.bookTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.CafeDto;
import com.example.bookTest.service.CafeService;

@Controller
public class CafeControl 
{
	
	@Autowired
	private CafeService cafeService;
	
	@GetMapping("/coffe")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("cafe/index");
		
		List<CafeDto> list = cafeService.printAll();
		mv.addObject("list", list);
				
		return mv;
	}
	
	@GetMapping("/coffeReg")
	public String cafeHome()
	{
		return "cafe/cafe";
	}
	
	
	
	@PostMapping("inputCafe")
	public String coffe(@ModelAttribute CafeDto cafeDto)
	{
		cafeService.coffeSave(cafeDto);
		return "cafe/cafeResult";
	}
	
	@GetMapping("/cafe/view")
	public ModelAndView view(@RequestParam ("id") int id)
	{
		CafeDto data = cafeService.getCoffe(id);
		return new ModelAndView("/cafe/view").addObject("coffe", data);
	}
	
	@GetMapping("/cafe/delete")
	public String coffeRemove(@RequestParam("id") int id)
	{
		cafeService.remove(id);
		
		return "redirect:/coffe";
	}
	
	
	
	
	
}
