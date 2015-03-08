package com.bnuz.yxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnuz.yxx.domain.User;
import com.bnuz.yxx.service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = null;

	public UserController() {
		super();
		userService = new UserService();
	}
	/*
	 * 处理登录界面的信息
	 */
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = userService.select(email);
		if (password.equals(user.getPassword())) {
			//request.getRequestDispatcher("PaperController?method=showPaper").forward(request, response);
			return "forward:/list.jsp";
		} else {
			request.setAttribute("errorMessage",
					"username or password error!! please login again");
			return "forward:/index.jsp";
		}
	}
}
