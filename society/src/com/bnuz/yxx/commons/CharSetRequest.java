package com.bnuz.yxx.commons;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CharSetRequest extends HttpServletRequestWrapper {

	public CharSetRequest(HttpServletRequest request) {
		super(request); // ���ø���Ĺ������������ഫ�ݵײ����
	}

	/*
	 * 
	 * ��ǿgetParameter()����
	 */
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		// �жϵ�ǰ������ʽ,���ΪGet
		// ��Ҫ���ˣ����ؽ�
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
