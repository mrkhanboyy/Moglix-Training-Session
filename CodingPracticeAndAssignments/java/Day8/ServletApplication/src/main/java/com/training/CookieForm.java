package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class CookieForm extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
//		Cookie firstname=new Cookie("first_name",req.getParameter("first_name"));
//		Cookie lastname=new Cookie("last_name",req.getParameter("last_name"));
//		
//		
//		
//		//set expriry after 24 hours
//		firstname.setMaxAge(60*60*24);
//		lastname.setMaxAge(60*60*24);
//		
//		//add both the cookie to response 
//		res.addCookie(firstname);
//		res.addCookie(lastname);
//		
//		
//		res.setContentType("text/html");
//		
//		PrintWriter out=res.getWriter();
//		
//		out.println("<!DOCTYPE html>\r\n" + 
//				"<html>\r\n" + 
//				"<head>\r\n" + 
//				"	<title></title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"\r\n" + 
//				"<ul>\r\n" + 
//				"	<li>\r\n" +req.getParameter("first_name")+
//				"\r\n" + 
//				"	</li>\r\n" + 
//				"\r\n" + 
//				"	<li>\r\n" +req.getParameter("last_name")+ 
//				"	</li>\r\n" + 
//				"</ul>\r\n" + 
//				"\r\n" + 
//				"\r\n" + 
//				"</body>\r\n" + 
//				"</html>");
		
		
		Cookie cookie=null;
		Cookie[] cookies=null;
		
		cookies=req.getCookies();
		
		PrintWriter out =resp.getWriter();
		if(cookies!=null) {
			
			for(int i=0;i<cookies.length;i++) {
				cookie=cookies[i];
				if((cookie.getName()).compareTo("first_name")==0) {
					cookie.setMaxAge(2);
					resp.addCookie(cookie);
					out.println("Delete Cookie "+cookie.getName()+"<br>");
				}
			}
		}
		
//		
//		for (int i = 0; i < cookies.length; i++) {
//			System.out.println(cookies[i].getName());
//			
//		}
		
	}
		
		
		
	}


