package com.bnuz.yxx.commons;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CharSetRequest extends HttpServletRequestWrapper {

	public CharSetRequest(HttpServletRequest request) {
		super(request); // 调用父类的构造器，给父类传递底层对象
	}

	/*
	 * 
	 * 增强getParameter()方法
	 */
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		// 判断当前的请求方式,如果为Get
		// 需要回退，再重解
		if (getMethod().equalsIgnoreCase("GET")) {
			try {
				if (value == null) {
						
				} else {
					value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
				}
			} catch (UnsupportedEncodingException e) {
			}
		}

		return value;
	}
}
