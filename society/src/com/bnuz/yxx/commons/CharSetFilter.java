package com.bnuz.yxx.commons;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * ����ȫվ��������
 * 
 * @author pomodory
 *
 */
@WebFilter("/*")
public class CharSetFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8"); //ֻ����post����
		
		response.setContentType("text/html;charset=utf-8");//������Ӧ����
		
		CharSetRequest req = new CharSetRequest((HttpServletRequest)request); //����ɽկ���request
		
		chain.doFilter(req, response); //Ŀ����Դ�õĵ������request
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
