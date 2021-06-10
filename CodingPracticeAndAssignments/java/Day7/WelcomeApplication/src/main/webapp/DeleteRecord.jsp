<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	int id = Integer.parseInt(request.getParameter("id").trim()); 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "username", "asAS@123");
	Statement stmt = con.createStatement();
	int s = stmt.executeUpdate("delete from user where id = "+id+";");
	
	if(s != 0){
	out.println("One record deleted with id "+id);
	}else{
	out.println("no record found with id "+id);
	}
	stmt.close();
	con.close();
%>
</body>
</html>