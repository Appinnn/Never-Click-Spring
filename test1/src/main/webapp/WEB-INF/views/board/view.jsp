<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 보기</title>
</head>
<body>
	<a href="/board">목록으로</a>
	<h2> 게시글 보기 </h2><hr><br>
	<h3> 제목 : ${saveTitle }</h3><br>
	<h3> 작성자 : ${saveWriter }</h3><br>
	<h3> 내용 : ${saveContent }</h3><br>
	<h3> 비밀번호 : ${savePw }</h3>
<!-- 
	동작 내용
	- 글쓰기를 클릭하여 게시글 작성 페이지로 이동 하고,  작성 버튼을 클릭하면 게시글보기 페이지로 이동하여 작성 한 내용을 출력한다.
	
	각페이지 이동하기 위한 Mapping 과 뷰 페이지에 데이터 출력 방법들을 작성하여 정상적으로
	동작 할 수 있게 하세요.



 -->	
	
</body>
</html>