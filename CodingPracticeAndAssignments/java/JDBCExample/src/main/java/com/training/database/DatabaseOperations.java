package com.training.database;

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

	public DatabaseOperations() throws SQLException {
		super();
		url = "jdbc:mysql://localhost:3306/example";
		username = "username";
		password = "asAS@123";
		con = DriverManager.getConnection(url, username, password);
	}

	public DatabaseOperations(String url, String username, String password) throws SQLException {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		con = DriverManager.getConnection(url, username, password);
	}

	public void createDatabase(String name) throws SQLException {
		Statement s1 = con.createStatement();
		int rs = s1.executeUpdate("create database " + name + ";");
		System.out.println(rs);
	}

	public void deleteDatabase(String name) throws SQLException{
		Statement s1 = con.createStatement();
		int rs = s1.executeUpdate("drop database "+name+";");
		System.out.println(rs);
	}

	public void createUser(int id, String name, int age) throws SQLException {
		Statement s1 = con.createStatement();
		int executeUpdate = s1
				.executeUpdate("insert into user(id,name,age) values(" + id + ",'" + name + "'," + age + ");");
		System.out.println(executeUpdate);
	}

	
	public void deleteUserById(int id) throws SQLException {
		Statement s1 = con.createStatement();
		int executeUpdate = s1.executeUpdate("delete from user where id = " + id);
		if (executeUpdate == 0) {
			System.out.println("user not found with id "+id);
			return;
		}
		System.out.println("user deleted with id = " + executeUpdate);
	}

	
	public void getUserById(int id) throws SQLException {
		Statement s1 = con.createStatement();
		ResultSet res = s1.executeQuery("select * from user where id = " + id);
		if (res == null) {
			System.out.println("no user found");
			return;
		}
		System.out.println(res.getInt(1) + "  " + res.getString(2) + "  " + res.getInt(3));
	}

	public void updateUser(int id, String name, int age) throws SQLException {
		Statement s1 = con.createStatement();
		int executeUpdate = s1.executeUpdate("update user set name = '"+name+"', age = "+age+" where id = " +id);
		if (executeUpdate == 0) {
			System.out.println("no user found");
			return;
		}
		System.out.println("user updated successfully");
	}
//	

	public void getAllUsers() throws SQLException {
		Statement s1 = con.createStatement();
		ResultSet res = s1.executeQuery("select * from user");

		while (res.next()) {
			System.out.println(res.getInt(1) + "  " + res.getString(2) + "  " + res.getInt(3));
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		DatabaseOperations databaseOperations = new DatabaseOperations();

//		for (int i = 0; i < 6; i++) {
//			databaseOperations.createUser(i, "user" + i, 19 + i);
//		}
//		databaseOperations.getAllUsers();

//		databaseOperations.deleteUserById(1);
//		databaseOperations.updateUser(0, "jon", 21);
		
//		databaseOperations.getAllUsers();

//		for(int i=1; i<6; i++) {			
//		}

//		databaseOperations.createDatabase("one");
//		databaseOperations.deleteDatabase("databaseone");

//		Connection con = null;
//		String query = "SELECT version()";
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection(url, username, password);
//
//			if (con != null) {
//				System.out.println("Connected");
//			} else {
//				System.out.println("Not conencted");
//			}
//
//			Statement s1 = con.createStatement();
//			ResultSet rs = s1.executeQuery(query);
//
//			if (rs.next()) {
//				System.out.println(rs.getString(1));
//			}
//
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			System.out.println(con);
//			con.close();
//		}
//
//	}
	}

}

//public static void getrecords(Connection con){
//String query = "select * from user";
//try {
//	ResultSet r = con.createStatement().executeQuery(query);
//	while(r.next()) {
//		System.out.println(r.getString(1)+"  "+r.getInt(2));
//	}
//} catch (SQLException e) {
//	e.printStackTrace();
//}
//
//}
