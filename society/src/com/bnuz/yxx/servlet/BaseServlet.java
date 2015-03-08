package com.bnuz.yxx.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet {
	
	/*
	 * 1.��ȡ����������ʶ���û�������ķ��� 2.�жϵ����ĸ����������Ǿ͵����ĸ�����
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡmethod����
		String methodName = request.getParameter("method");
		// �ж��û��Ƿ��д�����
		if (methodName == null || methodName.trim().isEmpty()) {
			throw new RuntimeException(
					"You haven't pass the method argument!!We can't confirm which method you want to call");
		}
		// ��ȡClass����ͨ����������Method����
		Class<? extends BaseServlet> clazz = this.getClass();
		Method method = null;
		try {
			method = clazz.getMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
		} catch (Exception e) {
			throw new RuntimeException("The method :" + methodName
					+ " you call isn't exit.");
		}
		//����method��ʾ�ķ���
		try {
			//�����������ִ�к���ַ���������ʾ�ض����ת����·����
			String result = (String)method.invoke(this, request, response);
			//������ص��ַ���Ϊ�ջ�"",��ʲô������
			if(result == null || result.trim().isEmpty()) {
				return ;
			}
			//ʹ��ð�ŷָ��ַ������õ�ǰ׺�ͺ�׺
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
			}else {//û��ð�ţ�Ĭ��Ϊת��
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
