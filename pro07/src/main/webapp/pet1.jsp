<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src='${param.animal}.jpg'>
<c:set var="name" value="이순신"/>
<input type='text' value=${name}`>
<c:remove var="name"/>
<input type='text' value=${name}`>
<c:if test="${name=='이순신'}">
</c:if>
</body>
</html>