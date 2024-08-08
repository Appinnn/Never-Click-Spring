<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/inputCafe">
		커피 이름 : <input type="text" name="itemName">
		커피 가격 : <input type="number" name="price"><br>
		카페인 유,무 선택 <br>
		카페인 O : <input type="radio" name="decaffein" value="0">
		카페인 X : <input type="radio" name="decaffein" value="1">
		<button>커피 등록</button>
		
	</form>
</body>
</html>