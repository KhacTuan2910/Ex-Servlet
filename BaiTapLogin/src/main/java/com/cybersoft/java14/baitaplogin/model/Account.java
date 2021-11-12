package com.cybersoft.java14.baitaplogin.model;

public class Account {
	private int id;
	private String username;
	private String password;
	private byte isAdmin;
	
	public Account() {
	}
	
	public Account(int id, String username, String password, byte isAdmin) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	
}
