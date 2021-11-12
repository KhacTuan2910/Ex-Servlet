package com.cybersoft.java14.baitaplogin.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cybersoft.java14.baitaplogin.datasource.MySQLConnection;
import com.cybersoft.java14.baitaplogin.model.Account;

public class LoginService {
	public Account checkAccount(String user, String pass) {
		try {
			Connection conn = MySQLConnection.getConnection();
			String query = "select username, _password\r\n"
							+ "from _account \r\n"
							+ "where "
								+ "username = ? and _password = ?";
			
			PreparedStatement state = conn.prepareStatement(query);
			state.setString(1, user);
			state.setString(2, pass);
			
			ResultSet rs = state.executeQuery();
			
			if (rs != null) {
				return new Account(user, pass);				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
