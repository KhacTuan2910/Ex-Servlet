package com.cybersoft.java14.baitaplogin.filter;

import java.io.IOException;

import com.cybersoft.java14.baitaplogin.utils.UrlConst;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {
		UrlConst.ROOT,
})
public class AuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		boolean isAuthed = req.getSession().getAttribute("isAuthenticated") 
							!= null ? true : false; 
		
		if (isAuthed) {
			chain.doFilter(req, resp);
		} else if (UrlConst.AUTH_LOGIN.equals(req.getServletPath())) {
			// nếu chưa đăng nhập và truy cập vào trnag đăng nhập thì cho qua
			chain.doFilter(req, resp);
		} else {
			resp.sendRedirect(req.getContextPath() + UrlConst.AUTH_LOGIN);
		}
	}

}
