package com.cybersoft.java14.servlet;

import java.io.IOException;

import com.cybersoft.java14.model.Product;
import com.cybersoft.java14.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "addProductServlet", urlPatterns = {
		"/add"
})
public class AddProductServlet extends HttpServlet{
	private ProductService proSer;
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		proSer = new ProductService();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		
		String name = req.getParameter("productName");
		String desc = req.getParameter("description");
		float price = Float.parseFloat(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		
		Product pd = new Product(name, desc, price, quantity);
		
		proSer.addProduct(pd);
		resp.sendRedirect(req.getContextPath() + "/product");
	}
}
