<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>See Detail</title>
</head>
<body>
<h2>글 상세 보기</h2>
	<h3>${board.title}</h3>
	${board.contents} 

<!-- Post라고 method를 명시를 안해주면 get으로 넘어간다. -->

<form action="./writeForm" method="post">
	<input type="hidden" name="boardNo" value="${board.boardNo}">
	<input type="submit" id="btnSubmit" value="수정">
</form>


<form action="./delete" method="post">
<!-- boardController에 존재하는 메소드 시그니처의 매개변수 명이랑 넘길 값 name을 일치시켜줘야 illegalStat오류가 안난다. -->
	<input type="hidden" name="boardNo" value="${board.boardNo}">
	<input type="submit" id="btnSubmit" value="삭제">
	</form>
</body>
</html>