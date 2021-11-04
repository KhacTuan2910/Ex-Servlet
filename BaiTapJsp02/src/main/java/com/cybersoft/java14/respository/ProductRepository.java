package com.cybersoft.java14.respository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.LinkedList;
import java.util.List;

import com.cybersoft.java14.datasource.MySQLConnection;
import com.cybersoft.java14.model.Product;

public class ProductRepository {
	
	public List<Product> getProducts() {
		List<Product> products = new LinkedList<Product>();
		Connection connection = null;
		
		try {
			connection = MySQLConnection.getConnection();
			String query = "SELECT id, _name, _description, price, stock FROM product;";
			
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				// lay 
				Product pd = new Product();
				pd.setId(rs.getString("id"));
				pd.setName(rs.getString("_name"));
				pd.setDescription(rs.getString("_description"));
				pd.setPrice(rs.getFloat("price"));
				pd.setStock(rs.getInt("stock"));
				
				products.add(pd);
			}
		} catch (SQLException e) {
			System.out.println("Khong the ket noi den co so du lieu");
			e.printStackTrace();
		} 
		
		return products;
	}
	
	public int addProduct(Product product) {
		try {
			Connection connection = MySQLConnection.getConnection();
			String query = "INSERT product(id, _name, _description, price, stock) VALUES(?, ?, ?, ?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, product.getId());
			statement.setString(2, product.getName());
			statement.setString(3, product.getDescription());
			statement.setFloat(4, product.getPrice());
			statement.setInt(5, product.getStock());
			
			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Không thể kết nối đến cơ sở dữ liệu");
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int removeProduct(String productId) {
		try {
			Connection connection = MySQLConnection.getConnection();
			String query = "DELETE FROM product WHERE id = ?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, productId);
			
			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Không thể kết nối đến cơ sở dữ liệu");
			e.printStackTrace();
		}
		
		return 0;
	}
}
