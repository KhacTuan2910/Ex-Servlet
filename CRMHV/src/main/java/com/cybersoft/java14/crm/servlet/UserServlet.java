package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "userServlet", urlPatterns = {
		UrlConst.USER_LIST,
		UrlConst.CREATE_USER
})
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		switch (path) {
		case UrlConst.CREATE_USER:
			req.getRequestDispatcher(JspConst.CREATE_USER)
				.forward(req, resp);
			break;
		case UrlConst.USER_LIST:
			req.getRequestDispatcher(JspConst.USER_LIST)			
				.forward(req, resp);
			break;

		default:
			break;
		}
	}
}
