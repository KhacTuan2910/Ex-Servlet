package com.cybersoft.java14.baitaplogin.servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import com.cybersoft.java14.baitaplogin.utils.JspConst;
import com.cybersoft.java14.baitaplogin.utils.UrlConst;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "homeServlet", urlPatterns = {
		UrlConst.HOME
})
public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/* đọc thời gian lần cuối mà người dung truy cập */
		Cookie[] cookies = req.getCookies();
		for (Cookie ck : cookies) {
			System.out.printf("name[%s]: %s\n", ck.getName(), ck.getValue());
		}
		
		/* Tạo cookie lưu trữ thời gian người dùng truy cập lần cuối (key, value)*/
		Cookie cookie = new Cookie("lastAccess", LocalDateTime.now().toString());
		resp.addCookie(cookie);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("userid", "Tuan Nguyen");
//		session.setAttribute("fullname", "Nguyen Khac Tuan");
//		
//		System.out.printf("fullname: %s\n", String.valueOf(session.getAttribute("fullname")));
		
		req.getRequestDispatcher(JspConst.HOME)
			.forward(req, resp);
	}
}
