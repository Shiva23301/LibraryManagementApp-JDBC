package com.library.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

	static Connection con;

	public static Connection createC() {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create the connection...
			String user = "root";
			String password = "sHiv@#1234#@";
			String url = "jdbc:mysql://localhost:3306/library_management";

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
