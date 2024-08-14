package com.movieAndgame.Dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MovieMember 
{
	@NotEmpty(message="이메일은 필수 입력란 입니다.")
	private String email;
	
	@Size(min=4 , max=12, message="비밀번호는 4 ~ 12 자리로 입력하세요")
	@Pattern(regexp="^[a-zA-Z0-9]*$", message="영어 대소문자, 숫자만 입력 가능합니다.")
	private String password;
	
	
	private String name;
	private int birthYear;
	private int birthMonth;
	
	@NotNull(message="연락처는 필수 입력란 입니다.")
	private String tel;
}

/*
 	Validation 데이터 유효성 검증
 	
 	 Annotation 의 종류
 	 1- @NotEmpty : null, 빈 문자열 불가
 	 2- @NotNull  : null 불가 (빈 문자열, 공백 허용)
 	 3- @Null     : null 만 허용
 	 4- @NotBlank : null, 빈 문자열, 공백 불가
 	 
 	 5- @Min(value= ) : value 이하의 값만 허용
 	 	@Min(value=10, message="10이하의 값만 입력하세요")
 	 	private int num;
 	 6- @Max(value= ) : value 이상의 값만 허용
 	 	@Max(value=5, message="5이상의 값만 입력하세요")
 	 	private int num;
 	 	
 	 7- @Size(min= , max=) : 길이를 제한 할 때 사용
 	 	@Size(min=10, max=20 , message="10자 이상 20자 이하만 입력하세요")
 	 	private String title;
 	 	
 	 8- @Positive : 양수의 값만 허용
 	 9- @PositiveOrZero : 양수와 0만 허용
 	 10- @Negative : 음수만 허용
 	 11- @NegaTiveOrZero : 음수와 0만 허용
 	 
 	 12- @Email : 이메일 형식 검사, 빈 문자열은 패스
 	 13- @Pattern( regexp= ) : 정규식 표현 검사
 
 
 
 
 */












