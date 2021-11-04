package com.cybersoft.java14.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.cybersoft.java14.datasource.MySQLConnection;
import com.cybersoft.java14.utils.UrlConst;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "healthServlet", urlPatterns = {
		UrlConst.HEALTH,
		UrlConst.DB_CHECK
})
public class HealthServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path =req.getServletPath();
		resp.setContentType("text/html");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		switch (path) {
		case UrlConst.HEALTH:
			
			break;
		case UrlConst.DB_CHECK:
			Connection testConnection = MySQLConnection.getConnection();
			if (testConnection != null) {
				resp.getWriter().append("thành công");
			} else {
				resp.getWriter().append("thất bại");
			}
			break;

		default:
			break;
		}
	}
}
