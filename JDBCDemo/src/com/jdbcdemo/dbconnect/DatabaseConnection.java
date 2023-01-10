package com.jdbcdemo.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.*;
public class DatabaseConnection {
	
	public static Connection getDBConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentmgmt";
			String username = "root";
			String password = "Rockmanoj12@";
			connection = DriverManager.getConnection(url, username, password);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());

	}
		return connection;

}
}

