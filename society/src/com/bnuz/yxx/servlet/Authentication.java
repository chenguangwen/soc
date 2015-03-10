package com.bnuz.yxx.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Authentication
 */
//@WebFilter("/paper/*")
//@WebFilter("/*")
public class Authentication implements Filter {
	public Authentication() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest res = (HttpServletRequest) request;
		//获取用户访问的uri
		//String uri = res.getRequestURI();
		//如果访问主页则不判断是否登录
		//if (!uri.endsWith("index.jsp")) {
			HttpSession session = res.getSession();
			System.out.println(session.getAttribute("username"));
			String username = (String) session.getAttribute("username");
			if (username == null) {
				res.setAttribute("errorMessage",
						"You haven't login, please login!!!");
				res.getRequestDispatcher("../index.jsp").forward(res,
						response);
			//}
		}
		chain.doFilter(res, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
