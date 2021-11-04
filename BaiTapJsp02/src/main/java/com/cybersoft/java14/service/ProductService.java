package com.cybersoft.java14.service;

import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java14.model.Product;
import com.cybersoft.java14.respository.ProductRepository;

public class ProductService {
	private List<Product> products;
	private ProductRepository repository;

	public ProductService() {
		repository = new ProductRepository();
	}
	
	public boolean addProduct(Product product) {
		return repository.addProduct(product) == 1 ? true : false;
	}
	
	public boolean removeProduct(String productId) {
		return repository.removeProduct(productId) == 1 ? true : false;
	}
//	public boolean removeProduct(String productId) {
//		if (productId == null || "".equals(productId)) {
//			return false;
//		}
//		
//		for (Product product : products) {
//			if (product.getId().equalsIgnoreCase(productId)) {
//				return products.remove(product);
//			}
//		}
//		
//		return false;
//	}
	
	public List<Product> getListProduct() {
		return repository.getProducts();
	}
}
