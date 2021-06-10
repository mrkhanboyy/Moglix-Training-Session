<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="ex" uri="WEB-INF/MyFile.tld"%>
<ex:MyTag/>
<ex:MyTag/>
<ex:MyTag/>
<ex:MyTag/>


	<jsp:useBean id="test" class="com.training.TestBean" />
	<jsp:setProperty name="test" property="message" value="Hello JSP...." />


	<p>GET MESSAGE</p>
	<jsp:getProperty name="test" property="message" />
	<br>
	
	<%
	Enumeration e = request.getHeaderNames();
	while (e.hasMoreElements()) {
		String pram = (String) e.nextElement();
		String pramValue = request.getHeader(pram);
		out.println("<pre>" + pram + ":     " + pramValue + "</pre>");
	}
	%>
	
	




</body>
</html>