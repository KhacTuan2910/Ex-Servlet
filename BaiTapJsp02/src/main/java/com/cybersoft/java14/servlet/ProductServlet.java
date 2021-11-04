package com.cybersoft.java14.servlet;

import java.io.IOException;

import com.cybersoft.java14.model.Product;
import com.cybersoft.java14.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "productServlet", urlPatterns = {
		"/product",
		"/product/add",
		"/product/remove"
})
public class ProductServlet extends HttpServlet{
	private ProductService service;
	
	@Override
	public void init() throws ServletException {
		super.init();
		service = new ProductService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		switch (path) {
		case "/product":
			req.setAttribute("products", service.getListProduct());
			req.getRequestDispatcher("/WEB-INF/view/product.jsp")
				.forward(req, resp);
			break;
		case "/product/add":
			
			break;
		case "/product/remove":
			String deleteId = req.getParameter("id"); 
			service.removeProduct(deleteId);
			resp.sendRedirect(req.getContextPath() + "/product");
			break;

		default:
			break;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String desc = req.getParameter("desc");
		float price = Float.parseFloat(req.getParameter("price"));
		int stock = Integer.parseInt(req.getParameter("stock"));
		Product product = new Product(id, name, desc, price, stock);
		this.service.addProduct(product);
		
		resp.sendRedirect(req.getContextPath() + "/product");
	}
}
