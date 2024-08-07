package com.example.bookTest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.bankDto;
import com.example.bookTest.DTO.bookDTO;
import com.example.bookTest.DTO.infoDTO;

@Controller
public class HomeController 
{
	//요청 주소와 메서드를 매핑(연결) 시켜준다.
	
	@GetMapping("/home")
	public String homePage() // 뷰 페이지만 제공 하는 경우엔 페이지 이름만 넘긴다.
	{
		return "home";
	}
	
	@GetMapping("/infoInput")
	public ModelAndView userInfoView(@ModelAttribute infoDTO infodto)
	{
		// ModelAndView는 사용자에게 제공할 페이지와 데이터를 저장할 수 있는 클래스이다.
		// 사용자에게 제공할 페이지는 객체 생성시 입력하거나 setViewName메서드로 입력하면 된다.
		ModelAndView mv = new ModelAndView("info");
		// mv.setViewName("info"); <- 메서드로 제공 페이지 입력
		String byear = infodto.getUBirth().substring(0, 4);
		int age = 2024 - Integer.parseInt(byear);
		mv.addObject("ageData", age); // 뷰 페이지에 전달할 데이터 설정
			
		return mv;
	}
	@GetMapping("/write")
	public String bookHome()
	{
		return "bookWrite";
	}
	
	@GetMapping("/writePage")
	public ModelAndView bookInfo(@ModelAttribute bookDTO bookdto)
	{
		ModelAndView mv = new ModelAndView();
//		mv.addObject("realBookName", bookdto.getBookName() );
//		mv.addObject("realBookWriter", bookdto.getBookWriter() );
//		mv.addObject("realBookPubl", bookdto.getBookPubl() );
		mv.addObject("bookInfo", bookdto );
		mv.setViewName("bookDetail");
		
		return mv;
	}
	
	@GetMapping("/input")
	public String bankHome()
	{
		return "bank";
	}
	
	@PostMapping("/bank")
	public ModelAndView result(@ModelAttribute bankDto bankdto)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("myBank", bankdto);
		mv.setViewName("result");
		
		return mv;
	}
}









