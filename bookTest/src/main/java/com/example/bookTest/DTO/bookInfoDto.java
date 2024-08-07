package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class bookInfoDto 
{
	private String bookTitle; // 책제목
	private String bookAuthor; // 저자
	private String bookCost; // 가격
	private String bookPage; // 페이지 수
	private String publisher; // 출판사
}
