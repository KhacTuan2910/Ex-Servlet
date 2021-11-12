package com.cybersoft.java14.baitaplogin.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {
	private final static String port = "3306";
	private final static String dbName = "accountDB";
	private final static String url = "jdbc:mysql://localhost:" + port + "/" + dbName;
	private final static String username = "root";
	private final static String password = "1234";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Không thể kết nối với cơ sở dữ liệu.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy Driver MýQL Connect J.");
			e.printStackTrace();
		}
		return null;
	}
}
