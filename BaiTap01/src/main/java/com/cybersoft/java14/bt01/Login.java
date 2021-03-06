package com.cybersoft.java14.bt01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = "/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
//		resp.setCharacterEncoding("UTF-8");
//		req.setCharacterEncoding("UTF-8");
		
		String loginForm = "<html lang=\"en\">\r\n"
				+ "<body>\r\n"
				+ "    <div style=\"display: flex; justify-content: center; align-items: center; flex-direction: column;\">\r\n"
				+ "        <h3 style=\"color: aquamarine;\">Đăng nhập</h3>\r\n"
				+ "        <form action=\"\" method=\"post\">\r\n"
				+ "            <label>Username: </label>\r\n"
				+ "            <input type=\"text\" name=\"username\">\r\n"
				+ "            <br>\r\n"
				+ "            <label>Password: </label>\r\n"
				+ "            <input  style=\"margin-top: 12px;\" type=\"password\" name=\"pass\">\r\n"
				+ "            <br>\r\n"
				+ "            <input style=\"margin-top: 12px;\" type=\"submit\" value=\"Đăng nhập\">"
				+ "        </form>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		resp.getWriter().append(loginForm);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		
		if ("admin123456".equals(username + pass)) {
			resp.sendRedirect("/BaiTap01/welcome");
		} else {
			this.doGet(req, resp);
		}
	}
}
