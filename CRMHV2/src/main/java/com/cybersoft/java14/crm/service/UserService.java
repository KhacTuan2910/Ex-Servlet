package com.cybersoft.java14.crm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cybersoft.java14.crm.entity.User;
import com.cybersoft.java14.crm.repository.UserRepository;

public class UserService {
	private UserRepository repository;
	
	public UserService() {
		repository = new UserRepository();
	}
	
	public List<User> getListUsers() {
		return repository.getAll();
	}

	public void addUser(HttpServletRequest req) {
		User us = new User();
		us.setName(req.getParameter("fullname"));
		us.setEmail(req.getParameter("email"));
		us.setPassword(req.getParameter("password"));
		us.setPhone(req.getParameter("phone"));
		us.setAddress(req.getParameter("address"));
		us.setRole(req.getParameter("role"));
		
		repository.insert(us);
	}
}
