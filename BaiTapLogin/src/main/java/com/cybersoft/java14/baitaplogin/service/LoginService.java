package com.cybersoft.java14.baitaplogin.service;

import com.cybersoft.java14.baitaplogin.dao.DAO;
import com.cybersoft.java14.baitaplogin.model.Account;

public class LoginService {
	private DAO dao = new DAO();
	
	public boolean hasAccount(String user, String pass) {
		Account acc = dao.loadAccount(user, pass);
		if (acc != null) {
			return true;
		}
		return false;
	}
}
