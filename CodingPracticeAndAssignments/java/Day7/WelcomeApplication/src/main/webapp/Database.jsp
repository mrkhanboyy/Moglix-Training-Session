<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database</title>
</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("id").trim());
	String name =  request.getParameter("name").trim();
	int age  =Integer.parseInt(request.getParameter("age").trim());
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "username", "asAS@123");
	Statement stmt = con.createStatement();
	stmt.executeUpdate("insert into user(id,name,age) values("+id+",'"+name+"',"+age+");");
	out.println("One record inserted");
	stmt.close();
	con.close();
	%>



</body>
</html>