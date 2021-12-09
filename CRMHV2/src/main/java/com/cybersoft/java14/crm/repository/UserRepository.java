package com.cybersoft.java14.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java14.crm.db.MySQLConnection;
import com.cybersoft.java14.crm.entity.User;

public class UserRepository {
	private List<User> users;
	
	public UserRepository() {
		users = new ArrayList<>();
	}
	
	public List<User> getAll() {
		String query = "select u.id, u.name, u.email, u.password, u.phone, u.address, r.name  \r\n"
				+ "from crm_app.crm_user u, crm_role r\r\n"
				+ "where u.role = r.id;";
		try (Connection conn = MySQLConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				User us = new User();
				us.setId(rs.getInt(1));
				us.setName(rs.getString(2));
				us.setEmail(rs.getString(3));
				us.setPassword(rs.getString(4));
				us.setPhone(rs.getString(5));
				us.setAddress(rs.getString(6));
				us.setRole(rs.getString(7));
				
				users.add(us);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
}
