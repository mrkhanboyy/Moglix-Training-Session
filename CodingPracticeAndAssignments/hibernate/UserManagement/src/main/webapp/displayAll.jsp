<%@page import="com.training.org.*,java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>

	<%
	List<User> users = UserDatabaseOperations.displayRecords();
	if(users.size() > 0){
	out.println("<table id=\"table-1\">\n"
			+ "		<thead>\n"
			+ "			<tr>\n"
			+ "				<th>Name</th>\n"
			+ "				<th>Email</th>\n"
			+ "			</tr>\n"
			+ "		</thead>\n"
			+ "		<tbody>" );
	for(int i=0; i<users.size(); i++){
		User s = users.get(i); 
		out.print("<tr>\n"
				+ "				<td>"+s.getName()+"</td>\n"
				+ "				<td>"+s.getEmail()+"</td>\n"
				+ "			</tr>");
	}
	
	out.print("</tbody></table>");
	}else{
		out.println("<h4>No Records Available</h4>");
	}
	%>
	
		

</body>
</html>