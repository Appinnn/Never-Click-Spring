<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="Post" action="/bank">
		은행명 : <input type="text" name="bankName"> <br>
		내 계좌 잔액 : <input type="number" name="myMoney"> <br>
		<button>등록</button>
	</form>
</body>
</html>