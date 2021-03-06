package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	
private String message;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init is called");
		message="Hello world";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet is called");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>"+message+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy is called");
		
	}
	
}
