package com.movieAndgame.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameDto 
{
	@NotEmpty(message="이메일은 필수 입력란 입니다.")
	private String email;
	
	@Size(min=4, max=14, message="비밀번호는 4자리 이상 14자리 이하만 가능합니다.")
	private String password;
	
	@NotBlank(message="닉네임은 공백으로 사용하실수 없습니다.")
	@Pattern(regexp="^[a-zA-z0-9]*$", message="닉네임에 특수문자는 사용하실수 없습니다.")
	private String nickName;
}
