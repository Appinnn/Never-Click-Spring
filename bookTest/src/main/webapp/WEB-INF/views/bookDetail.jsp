<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookDetail</title>
</head>
<body>
	<h2> 사용자가 입력한 도서정보</h2><br><hr><br>
	<h3> 책 제목 : ${bookInfo.getBookName() }</h3> <br>
	<h3> 출판사  : ${bookInfo.BookPubl() }</h3> <br>
	
</body>
</html>


<!-- 
	뷰 페이지
		bookWrite.jsp - 도서정보 입력 페이지
						책 제목, 저자, 출판사 입력
		bookDetail.jsp - 도서정보 출력 페이지
						책 제목, 출판사 출력
						
	요청 주소
		/write - GET (도서정보 입력 페이지 제공)
		/detail - GET (도서정보 출력페이지 제공)
		
	동작 흐름 : 사용자가 localhost/write 라고 브라우저에 입력하고 페이지에서 도서 정보를 입력 후 버튼을 클릭한다.
			 다음에 제공되는 페이지에서는 사용자가 입력한 값이 출력 되어야 한다.
		
 -->
 
 
 
 
 <!-- 
 	동작 : 사용자가 local/input 이라고 브라우저에 주소를 입력
 		  브라우저에 보이는 페이지에서 은행명과 통장 잔액을 입력하고, 등록 버튼을 누르면 다음 페이지에서 잔액이 얼마인지 출력한다.
 		  
 	뷰페이지
 		bank.jsp - 은행명과 통장잔액 입력 페이지
 		result.jsp - 잔액 출력 페이지
 		
 	요청 주소 및 방식
 		Get - /input : 은행명과 통잔잔액 입력 페이지
 		Post - /result : 잔액 출력 페이지
 
 
  -->
  
  
  
  
  
  
  
  