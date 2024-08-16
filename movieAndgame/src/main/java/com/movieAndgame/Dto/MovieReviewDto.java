package com.movieAndgame.Dto;

import java.time.LocalDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Valid
public class MovieReviewDto 
{
	
	private int reviewId;
	
	@NotBlank(message="제목은 필수로 작성하셔야 합니다.")
	private String title;
	private String writer;
	
	@Size(min=10, max=300, message="내용은 10자이상, 300자 이내로 작성하셔야 합니다.")
	private String content;
	
	private LocalDateTime writeDate;
}
