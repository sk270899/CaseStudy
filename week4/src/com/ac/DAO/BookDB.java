package com.ac.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDB {

	// static connection method returns connection obj
	public static Connection getConnection() throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/student", "postgres", "postgres");

		return conn;
	}
}
