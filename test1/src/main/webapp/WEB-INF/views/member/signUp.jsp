<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/signUp">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="pw"> <br>
		연락처 : <input type="tel" name="tel"> <br>
		생년월일 : <input type="text" name="birth"> <br>
		<button>가입</button>		
	</form>




<!--  
	<div>
		<h3>아이디 및 비밀번호를 입력하세요</h3><input type="text" placeholder="아이디">
		<input type="password" placeholder="비밀번호">
		<h3>연락처를 입력하세요.</h3><input type="number">
		<h3>생년월일을 선택하세요.</h3><input type="date" placeholder="생년월일을 입력하세요">
	</div>
-->
</body>
</html>