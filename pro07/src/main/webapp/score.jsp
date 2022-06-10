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
	String pScore = request.getParameter("score");
	if (pScore == null || pScore.equals("")) {
	%>
	<h1>점수가 주어지지 않았습니다.</h1>
	<%
	} else {
	int nScore = Integer.parseInt(pScore);
	if (nScore > 89) {
	%>
	<%="<h1>등급:A</h1>" %>
	<%
	} else if (nScore > 79) {
	%>
	<%="<h1>등급:B</h1>" %>
	<%
	} else if (nScore > 69) {
	%>
	<%="<h1>등급:C</h1>" %>
	<%
	} else if (nScore > 59) {
	%>
	<%="<h1>등급:D</h1>" %>
	<%
	} else {
	%>
	<%="<h1>등급:F</h1>" %>
	<%
	}
}
	%>
</body>
</html>