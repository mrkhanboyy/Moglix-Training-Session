package com.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String message = "this is login page";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
	
		String username = req.getParameter("username");
				String password = req.getParameter("password");
				
				
				DatabaseOperations db = null;
						try {
							db= new DatabaseOperations();
						} catch (Exception e) {
							e.printStackTrace();
						} 
				
						User user = null;
						try {
							user = db.getUserByUsername(username);
						} catch (SQLException e) {
							e.printStackTrace();
						}
						PrintWriter out=response.getWriter();
						if(user == null) {
							out.println("user not exists kindly signup first");
							
						}else {
							out.println("user found");
						}
						
		
		
		
//		String title="USing get method";
//		String doType="<!DOCTYPE html>";
//		PrintWriter out=response.getWriter();
//		out.println("<!DOCTYPE html>\r\n" + 
//				"<html>\r\n" + 
//				"<head>\r\n" + 
//				"	<title></title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"\r\n" + 
//				"	<ul>\r\n" + 
//				"		<li>"+req.getParameter("first_name")
//				+ "</li>\r\n" + 
//				"		<li>"+req.getParameter("last_name")
//				+ "</li>\r\n" + 
//				"\r\n" + 
//				"</ul>\r\n" + 
//				"\r\n" + 
//				"\r\n" + 
//				"\r\n" + 
//				"</body>\r\n" + 
//				"</html>");
//		
//		System.out.println("doGet is called");
//		response.setContentType("text/html");
//		out.println("<h1>"+message+"</h1>");
	}

}
