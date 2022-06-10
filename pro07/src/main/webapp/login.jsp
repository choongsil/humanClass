<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("userpwd");
	if (userid.equals("admin")) {
	%>
	관리자로 로그인했습니다.<br>
	userid[<%=userid%>]<br>
	<%
	} else if (userid == null || userid.equals("")) {
	%>
	아이디가 입력되지 않았습니다.<br>
	<%
	} else {
	%>
	일반회원으로 로그인했습니다.<br> 
	userid[<%=userid%>]<br>
	<%
	}
	%>
</body>
</html>