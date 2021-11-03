package com.cybersoft.java14.model;

public class Product {
	private String id;
	private static int idAuto = 0;
	private String name;
	private String description;
	private float price;
	private int stock;
	
	public Product(String id, String name, String description, float price, int stock) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}

	public String getId() {
		return id;
	}

	public static int getIdAuto() {
		return idAuto;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	
	
	
}
