package com.movieAndgame.Dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GamePostDto 
{
	private int postId;
	
	private String writer;
	@NotBlank(message="제목은 필수로 작성 하셔야 합니다.")
	private String title;
	@NotBlank(message="게임이름은 필수로 작성 하셔야 합니다.")
	private String gameName;
	@Size(min=5, max=1000, message="내용은 5자 이상 1000자 이내로 작성하셔야 합니다.")
	private String targetPost;
	private LocalDateTime writeDate;
}
