<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<c:if test="${param.dan==null||param.dan.equals(' ')}">
단수를 입력해 주세요
</c:if>
<c:if test="${param.dan!=null&&!param.dan.equals(' ')}">
<c:forEach var="i" begin="1" end="9" step="1">
${param.dan}X${i}=${param.dan*i}<br>  
</c:forEach>
</c:if>	
</body>
</html>