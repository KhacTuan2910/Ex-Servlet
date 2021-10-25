package com.cybersoft.java14.bt01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "welcome", urlPatterns = "/welcome")
public class Welcome extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String mess = "<h2 style=\"color: red;\">Đăng nhập thành công </h2>";
		
		resp.getWriter().append(mess);
	}
}
