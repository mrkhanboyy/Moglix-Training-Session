<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.training.org.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>

	<%
	int id = Integer.parseInt(request.getParameter("id"));
	User user = (User)UserDatabaseOperations.findRecordById(id);
	if(user != null){
		UserDatabaseOperations.deleteRecord(id);
		out.println("user with id = "+id+" deleted successfully");
	}else{
		out.println("user with id = "+id+" not exists");
	}
	%>

</body>
</html>