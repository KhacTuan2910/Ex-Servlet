package com.cybersoft.java14.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "productServlet", urlPatterns = {
		"/product"
})
public class ProductServlet extends HttpServlet{
	
}
