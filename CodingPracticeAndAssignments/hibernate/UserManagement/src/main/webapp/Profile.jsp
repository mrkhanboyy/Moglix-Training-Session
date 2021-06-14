<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.training.org.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

	<%
	int id = Integer.parseInt(request.getParameter("id"));
	User user = (User)UserDatabaseOperations.findRecordById(id);
	if(user != null){
		out.println("<pre>PROFILE");
		out.println("Name :       "+user.getName());
		out.println("email:       "+user.getEmail()+"</pre>");

	}else{
		out.println("user with id = "+id+" not exists");
	}
	%>
	



</body>
</html>