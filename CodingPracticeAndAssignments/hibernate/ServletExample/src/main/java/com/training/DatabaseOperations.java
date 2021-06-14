package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {

	private String url;
	private String username;
	private String password;
	private Connection con;

	public DatabaseOperations() throws SQLException, ClassNotFoundException {
		super();
		url = "jdbc:mysql://localhost:3306/example";
		username = "username";
		password = "asAS@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
	}

	public DatabaseOperations(String url, String username, String password) throws SQLException {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		
		con = DriverManager.getConnection(url, username, password);
	}




	public void createUser(String username, String password) throws SQLException {
		Statement s1 = con.createStatement();
		int executeUpdate = s1
				.executeUpdate("insert into user(username,password) values( '"+username+"','"+password+"');");
		System.out.println(executeUpdate);
	}

	
	public User getUserByUsername(String username) throws SQLException {
		Statement s1 = con.createStatement();
		ResultSet res = s1.executeQuery("select * from user where username = '" +username+"'");
		if (!res.next()) {
			System.out.println("no user found");
			return null;
		}
		return new User(res.getString(1), res.getString(2));
	}
}