<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${param.animal==null||param.animal.equals(' ')}">
<h1>애완동물을 지정하십시오</h1>
</c:when>
<c:when test="${param.animal=='cat'}">
<img src="cat.jpg">
</c:when>
<c:when test="${param.animal=='dog'}">
<img src="dog.jpg">
</c:when>
</c:choose>
<c:forEach var="" items="" begin="" end="" step="" varStatus=""></c:forEach>
</body>
</html>