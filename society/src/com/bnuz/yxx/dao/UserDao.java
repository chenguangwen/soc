package com.bnuz.yxx.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.bnuz.yxx.commons.TxQueryRunner;
import com.bnuz.yxx.domain.Page;
import com.bnuz.yxx.domain.User;

public class UserDao {
	private QueryRunner qr = new TxQueryRunner();

	/*
	 * 根据user对象属性插入user表
	 */
	public boolean insert(User user) throws SQLException {
		// 准备插入语句模板
		String sql = "insert into user values(?,?,?,?,?,?)";
		// 获取参数
		Object[] params = { user.getId(), user.getName(), user.getPassword(),
				user.getCompetence(), user.getEmail() };
		// 执行并判断是否成功
		if (qr.update(sql, params) == 1) {
			return true;
		}
		return false;
	}

	/*
	 * 根据id查找用户记录并返回一个User对象
	 */
	public User select(String email) throws SQLException {
		// 准备sql模板
		String sql = "select * from user where email =?";
		// 获取参数
		Object[] params = { email };
		// 得到User对象
		User user = qr.query(sql, new BeanHandler<User>(User.class), params);
		return user;
	}
	

	/*
	 * 查询有多少用户
	 */
	public int queryNumber() throws SQLException {
		// 准备sql模板
		String sql = "select count(id) from user";
		// 获取number
		Number number = qr.query(sql, new ScalarHandler<Integer>());
		// 获取int类型
		return number.intValue();
	}

	/*
	 * 根据当前页查找用户并返回一个包含User的List
	 */
	public List<User> find(int page) throws SQLException {
		String sql = "select * from user order by id asc limit ?,?";
		int currentPage = (page - 1) * Page.PAGE_SIZE;
		Object[] params = { currentPage, Page.PAGE_SIZE };
		return qr.query(sql, new BeanListHandler<User>(User.class), params);
	}

	/*
	 * 根据姓名和出生日期查找用户并返回一个包含User的List
	 */
	public List<User> select(String name, java.util.Date birthday)
			throws SQLException {
		String sql = "select * from user where name=? and birthday=?";
		Object[] params = { name, birthday };
		return qr.query(sql, new BeanListHandler<User>(User.class), params);
	}

	/*
	 * 根据id删除指定用户
	 */
	public boolean delete(int id) throws SQLException {
		String sql = "delete from user where id=?";
		Object param = id;
		if (qr.update(sql, param) == 1) {
			return true;
		}
		return false;
	}

	@Test
	public void fun1() throws SQLException {
		User u = select("pomodory@live.com");
		System.out.println(u);
	}
}
