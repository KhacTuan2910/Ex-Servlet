package com.cybersoft.java14.service;

import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java14.model.Product;

public class ProductService {
	private List<Product> products;

	public ProductService() {
		products = new ArrayList<>();
		products.add(new Product("P2005", "Iphone13", "Apple Ip13", 599, 13));
		products.add(new Product("P2006", "Iphone13 mini", "Apple Ip13mini", 549, 10));
		products.add(new Product("P2007", "Iphone13 pro", "Apple Ip13pro", 699, 20));
		products.add(new Product("P2008", "Iphone13 pro max", "Apple Ip13promax", 999, 9));
		products.add(new Product("P2009", "Iphone13 super", "Apple Ip13super", 1099, 3));
	}
	
	public boolean addProduct(Product product) {
		if (product == null) 
			return false;
		/* product id can not be duplicated */
		for (Product p : products) 
			if (p.getId().equalsIgnoreCase(product.getId()))
				return false;
		
		return products.add(product);
	}
	
	public boolean removeProduct(String productId) {
		if (productId == null || "".equals(productId)) {
			return false;
		}
		
		for (Product product : products) {
			if (product.getId().equalsIgnoreCase(productId)) {
				return products.remove(product);
			}
		}
		
		return false;
	}
	
	public List<Product> getListProduct() {
		return this.products;
	}
}
