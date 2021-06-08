package com.training.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	 public static void main(String[] args) throws Exception
	    {
	    	Connection con=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
//				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","debian-sys-maint","NcZPsQRYsB9WfKcM");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","username","asAS@123");
				
				
				if(con != null) {
					System.out.println("Connected");
				}
				else
					System.out.println("Not conencted");
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println(con);
				con.close();
			}
	    }
	   
}
