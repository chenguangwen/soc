package com.bnuz.yxx.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.bnuz.yxx.dao.UserDao;
import com.bnuz.yxx.domain.User;

public class UserService {
	private UserDao userDao = new UserDao();
	/*
	 * 插入用户
	 */
	public boolean insert(User user) {
		boolean judge = false;
		try {
			judge = userDao.insert(user);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return judge;
	}

	/*
	 * 根据id查询用户
	 */
	public User select(String email) {
		User user = null;
		try {
			user = userDao.select(email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}


	/*
	 * 查询有多少用户
	 */
	public int queryNumber() {
		int count = 0;
		try {
			count = userDao.queryNumber();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

	/*
	 * 根据用户名和生日查询用户
	 */
	public List<User> select(String name, Date birthday) {
		List<User> list = null;
		try {
			list = userDao.select(name, birthday);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}
	
	/*
	 * 根据id删除用户
	 */
	public boolean delete(int id) {
		boolean judge = false;
		try {
			judge = userDao.delete(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return judge;
	}
}
