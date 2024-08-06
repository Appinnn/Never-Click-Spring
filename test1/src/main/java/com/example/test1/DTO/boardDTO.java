package com.example.test1.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class boardDTO 
{
	private String title;
	private String writer;
	private String content;
	private String boardPw;
}
