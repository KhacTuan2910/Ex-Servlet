package com.cybersoft.java14.service;

import java.util.LinkedList;
import java.util.List;

import com.cybersoft.java14.model.Product;

public class ProductService {
private List<Product> products;
	
	public ProductService() {
		products = new LinkedList<Product>();
		
		products.add(new Product("Accent 2021", "Full-option", 540000000f, 5));
		products.add(new Product("Serato 2020", "Base", 500000000f, 12));
		products.add(new Product("Vios 2021", "G-serial", 600000000f, 3));
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
	
	public boolean addProduct(Product product){
		if(product != null)
		 return this.products.add(product);
		return false;
	}
	
}
