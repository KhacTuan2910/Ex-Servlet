package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.service.UserService;
import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "userServlet", urlPatterns = {
		UrlConst.USER,
		UrlConst.CREATE_USER
})
public class UserServlet extends HttpServlet {
	private UserService service;
	private String action;
	
	@Override
	public void init() throws ServletException {
		super.init();
		service = new UserService();
		action = "";
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		action = req.getServletPath();
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (action) {
		case UrlConst.CREATE_USER:
			req.getRequestDispatcher(JspConst.CREATE_USER)
				.forward(req, resp);
			break;
		case UrlConst.USER:
			req.setAttribute("users", service.getListUsers());
			req.getRequestDispatcher(JspConst.USER)			
				.forward(req, resp);
			break;

		default:
			break;
		}
	}
}
