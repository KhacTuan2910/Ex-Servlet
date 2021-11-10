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
		UrlConst.ROOT
})
public class EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		/* code thực hiện khi nhận request */
		req.setCharacterEncoding("UTF-8");
		
		chain.doFilter(req, resp);
		/* code thực hiện khi trả response */
		resp.setCharacterEncoding("UTF-8");
	}

}
