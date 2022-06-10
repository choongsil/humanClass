<jsp:include page='head.jsp'/>
<h1>home.jsp</h1>
<%
if(request.getParameter("page").equals("dan")){
	RequestDispatcher dp=request.getRequestDispatcher("pet.jsp");
	request.setAttribute("animal","cat");
	dp.forward(request,response);
%>
<jsp:forward page='pet.jsp'>
<jsp:param name='animal' value='cat'/>
</jsp:forward>
<%
}else if(request.getParameter("page").equals("login")){

%>
<jsp:forward page='login3.jsp'></jsp:forward>
<%
}
%>
</body>
</html>