<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FirstJspPage</title>
</head>
<body>

<%! int i = 100;

%>

<% 
out.println("value of i" + i); 
out.println(100*2); 
%>
	<%
		out.println("Ip address"+request.getRemoteAddr());
	
	%>
<%
out.println("hello");
%>

</body>
</html>