<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to UltraVioloet</title>
</head>
<body>
	<h1>게시판 목록</h1>
	<table>
		<tr>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
			<td>조회수</td>
		</tr>
		
		<c:forEach items="${boardList}" var="board">
			<tr>
				<td><a href="./detail?boardNo=${board.boardNo}">${board.title}</a></td>
				<td>${board.contents}</td>
				<td>${board.userNo}</td>
				<td>${board.hit}</td>
		</tr>
		</c:forEach>
	</table>
	<input type="submit" id="btnSubmit" value="submit"
		onclick="location.href='./writeForm'">


</body>
</html>