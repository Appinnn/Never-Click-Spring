<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookWrite</title>
</head>
<body>
	<h2>도서 정보 등록하기</h2> <br> <hr>
	<form method="get" action="/writePage">
		책 제목 : <input type="text" name="bookName"> <br>
		저 자 : <input type="text" name="bookWriter"> <br>
		출판사 : <input type="text" name="bookPubl"> <br>
		<button> 등록하기 </button>
	
	</form>
	
</body>
</html>