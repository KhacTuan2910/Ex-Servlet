package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;


@WebServlet(name = "projectServlet", urlPatterns = {
		UrlConst.CREATE_PROJECT,
		UrlConst.MANAGE_PROJECT
})
public class ProjectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		switch (path) {
		case UrlConst.CREATE_PROJECT:
			req.getRequestDispatcher(JspConst.CREATE_PROJECT)
				.forward(req, resp);
			break;
		case UrlConst.MANAGE_PROJECT:
			req.getRequestDispatcher(JspConst.MANAGE_PROJECT)			
				.forward(req, resp);
			break;

		default:
			break;
		}
	}
}