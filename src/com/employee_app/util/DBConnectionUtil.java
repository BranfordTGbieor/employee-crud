package com.employee_app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
	
	private static final String user_name = "root";
	private static final String password = "r00t";
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/employeeApp_db";
	private static final String driver = "com.mysql.jdbc.Driver";
	
	private static Connection connection = null;
	
	public static Connection openConnection() {
		
		if(connection != null) {
			return connection;
		}else {
			
			try {
				Class.forName(driver);
				
				connection = DriverManager.getConnection(jdbcURL, user_name, password);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return connection;
		}
		
	}

}
