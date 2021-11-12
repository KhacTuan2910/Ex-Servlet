package com.cybersoft.java14.baitaplogin.servlet;

import java.io.IOException;

import com.cybersoft.java14.baitaplogin.service.LoginService;
import com.cybersoft.java14.baitaplogin.utils.JspConst;
import com.cybersoft.java14.baitaplogin.utils.UrlConst;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "loginServlet", urlPatterns = {
		UrlConst.AUTH_LOGIN
})
public class LoginServlet extends HttpServlet{
	private LoginService loginservice;
	
	@Override
	public void init() throws ServletException {
		loginservice = new LoginService();
//		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(JspConst.AUTH_LOGIN)
			.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (loginservice.hasAccount(username, password)) {
			req.getSession().setAttribute("fullname", username);
			req.getSession().setAttribute("isAuthenticated", true);
			resp.sendRedirect(req.getContextPath() + UrlConst.HOME);
		} else {
			resp.sendRedirect(req.getContextPath() + UrlConst.AUTH_LOGIN);
		}
	}
}
