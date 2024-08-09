<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피 정보 보기</title>
<link rel="stylesheet" href="/css/info.css">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="/javascript/info.js"></script>

<script>
	inputType = ["text", "number", "radio"];
	inputName = ["itemName", "price" , "decaffein"];
</script>
</head>
<body>
<form id="fm" method="get" action="/cafe/delete">
	<input type="hidden" name="id" value="${coffe.coffeId }">
	<div id="wrap">
		<a href="/coffe">HOME</a>
		<table id="viewBox">
			<tr>
				<td class="fieldName">커피 이름</td>
				<td class="value">
					${coffe.itemName }
				</td>
			</tr>
			<tr>
				<td class="fieldName">가 격</td>
				<td class="value">
					${coffe.price }
				</td>
			</tr>
			<tr>
				<td class="fieldName">카페인 유,무</td>
				<td class="value">
					${coffe.decaffein== 1 ? '카페인 O' : '카페인 X' }
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<button type="button" id="modify">수정</button>
					<button type="button" id="del" data-id="${coffe.coffeId }">삭제</button>
				</td>
			</tr>
		</table>
	</div>
</form>
</body>
</html>