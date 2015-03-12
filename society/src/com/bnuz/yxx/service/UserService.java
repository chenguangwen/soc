package com.bnuz.yxx.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.bnuz.yxx.dao.UserDao;
import com.bnuz.yxx.domain.User;

public class UserService {
	private UserDao userDao = new UserDao();
	/*
	 * �����û�
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
	 * ����id��ѯ�û�
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
	 * ��ѯ�ж����û�
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
	 * �����û��������ղ�ѯ�û�
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
	 * ����idɾ���û�
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
