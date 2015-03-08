package com.bnuz.yxx.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet {
	
	/*
	 * 1.获取参数，用来识别用户想请求的方法 2.判断调用哪个方法，我们就调用哪个方法
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取method参数
		String methodName = request.getParameter("method");
		// 判断用户是否有传参数
		if (methodName == null || methodName.trim().isEmpty()) {
			throw new RuntimeException(
					"You haven't pass the method argument!!We can't confirm which method you want to call");
		}
		// 获取Class对象，通过方法名获Method对象
		Class<? extends BaseServlet> clazz = this.getClass();
		Method method = null;
		try {
			method = clazz.getMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
		} catch (Exception e) {
			throw new RuntimeException("The method :" + methodName
					+ " you call isn't exit.");
		}
		//调用method表示的方法
		try {
			//获得请求处理方法执行后的字符串，它表示重定向或转发的路径！
			String result = (String)method.invoke(this, request, response);
			//如果返回的字符串为空或"",则什么都不做
			if(result == null || result.trim().isEmpty()) {
				return ;
			}
			//使用冒号分割字符串，得到前缀和后缀
			if(result.contains(":")) {
				int index = result.indexOf(":");
				String prefix = result.substring(0, index);
				String suffix = result.substring(index + 1);
				if(prefix.equals("redirect")) {
					response.sendRedirect(request.getContextPath() + suffix);
				}else if(prefix.equals("forward")) {
					request.getRequestDispatcher(suffix).forward(request, response);
				}else {
					throw new RuntimeException("The Operaton " + prefix + "can't operation");
				}
			}else {//没有冒号，默认为转发
				request.getRequestDispatcher(result).forward(request, response);
			}
			
		} catch (Exception e) {
			System.out.println("The method you call " + methodName
					+ "'s inner throw exception");
			throw new RuntimeException(e);
		}
		/*
		 * String methodName = request.getParameter("method");
		 * if(methodName.equals("addUser")){ addUser(request, response); }
		 */
	}


}
