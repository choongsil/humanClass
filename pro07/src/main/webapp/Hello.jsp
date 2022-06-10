<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫번째 JSP 페이지</title>
</head>
<body>
	<!--<h1>hello JSP!!</h1>
	<h1>JSP실습입니다.!!</h1>-->
	<c:set var="name" value="유관순">
	</c:set>
	<input type=text value="${name}">
</body>
</html>