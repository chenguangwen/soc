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
 * 处理全站编码问题
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
		
		request.setCharacterEncoding("UTF-8"); //只处理post请求
		
		response.setContentType("text/html;charset=utf-8");//处理响应编码
		
		CharSetRequest req = new CharSetRequest((HttpServletRequest)request); //创建山寨版的request
		
		chain.doFilter(req, response); //目标资源用的调包后的request
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
