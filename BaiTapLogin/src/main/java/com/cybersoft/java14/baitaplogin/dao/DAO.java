package com.cybersoft.java14.baitaplogin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cybersoft.java14.baitaplogin.datasource.MySQLConnection;
import com.cybersoft.java14.baitaplogin.model.Account;

public class DAO {
	public Account loadAccount(String user, String pass) {
		try {
			Connection conn = MySQLConnection.getConnection();
			String query = "select id, username, _password, isAdmin\r\n"
					+ "from _account \r\n"
					+ "where username = ? and _password = ?";
			
			PreparedStatement state = conn.prepareStatement(query);
			state.setString(1, user);
			state.setString(2, pass);
			
			ResultSet rs = state.executeQuery();
			while (rs.next()) {

				return new Account(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getByte(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

