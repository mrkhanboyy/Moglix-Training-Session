<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import=" com.training.org.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("password");

UserDatabaseOperations.createRecord(new User(name,email,password));
out.println("user successfully saved");

%>



</body>
</html>