package com.slk.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

final public class Dbutil {
	public static Connection getconnection() throws ClassNotFoundException,SQLException{
		
		ResourceBundle rb= ResourceBundle.getBundle("com.slk.util.jdbc");
		String driver= rb.getString("driverClassName");
		String url= rb.getString("url");
		String user= rb.getString("user");
		String password=rb.getString("password");
		 Class.forName(driver);
		 return DriverManager.getConnection(url, user, password);
		
	}

}
