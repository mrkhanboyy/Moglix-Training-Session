<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.Instant"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% response.setHeader("refresh","5"); %>
<%@ page import = "java.util.*"   %>
<%  Date d = new Date( ) ;   %>
Time Particulars: <BR>  <BR>
Hours: <%=  d.getHours( )   %>   <BR>
Minutes: <%=   d.getMinutes( )   %>   <BR>
Seconds: <%=  d.getSeconds( )   %>

	
	<%
	String name = request.getParameter("name").trim();
	%>
	
	<%
	
	if (name.equals("tanish")) {
	%>
	<jsp:forward page="success.html" />
	<%
		} else
	%>
	<jsp:forward page="failure.html" />
	
	
	Welcome
	<%=name%><br>
	 Current Date :	<%=LocalDate.now()%><br>
	  Current time :	<%=LocalTime.now()%>

</body>
</html>