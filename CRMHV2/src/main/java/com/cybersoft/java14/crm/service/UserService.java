package com.cybersoft.java14.crm.service;

import java.util.List;

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
}
