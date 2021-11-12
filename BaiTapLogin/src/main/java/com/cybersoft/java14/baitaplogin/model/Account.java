package com.cybersoft.java14.baitaplogin.model;

public class Account {
	private int id;
	private String username;
	private String password;
	private byte isAdmin;
	
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	
}
