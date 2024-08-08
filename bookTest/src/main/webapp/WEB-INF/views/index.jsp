<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 도서관리 </title>
<link rel="stylesheet" href="/css/default.css">
</head>
<body>

	<!-- 
	클래스명
		컨트롤 : CoffeControl
		서비스 : CoffeService
		DTO : CoffeDto
		DAO : CoffeDao
	
	 -->
	${list.get(0).bookTitle }
	<div id="wrap">
		<h2> 도서관리 </h2>
		
		<div id="mainTitle">
			<h3> 등록 도서 목록 </h3>
			<a href="/bookWrite" id="enroll">도서등록</a>
		</div>
		<div id="bookListWrap">
			<ul id="bookList">
			<c:forEach var="row" items="${list }">
				<li class="blist">
					<span class="title">${row.bookTitle }</span>
					<span class="auth">${row.bookAuthor }</span>
					<span class="bookCode">${riw.bookId }</span>
					<span class="category">${row.publisher }</span>
				</li>
			</c:forEach>	
				<li class="blist">
					<span class="title">점심 식사에 관한 고찰</span>
					<span class="auth">최말라깽이</span>
					<span class="bookCode">L1U2N3C4C</span>
					<span class="category">음식</span>
				</li>
				<li class="blist">
					<span class="title">오목 승리 방법</span>
					<span class="auth">김오목</span>
					<span class="bookCode">0134BN2</span>
					<span class="category">전략</span>
				</li>
				<li class="blist">
					<span class="title">스프링 나쁘지 않네</span>
					<span class="auth">김붕어</span>
					<span class="bookCode">920K2B</span>
					<span class="category">물고기</span>
				</li>
				<li class="blist">
					<span class="title">인간시대의 발전 기원</span>
					<span class="auth">블리츠크랭크</span>
					<span class="bookCode">K21AS5</span>
					<span class="category">전쟁</span>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>