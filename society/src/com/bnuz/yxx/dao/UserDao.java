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
	 * ����user�������Բ���user��
	 */
	public boolean insert(User user) throws SQLException {
		// ׼���������ģ��
		String sql = "insert into user values(?,?,?,?,?,?)";
		// ��ȡ����
		Object[] params = { user.getId(), user.getName(), user.getPassword(),
				user.getCompetence(), user.getEmail() };
		// ִ�в��ж��Ƿ�ɹ�
		if (qr.update(sql, params) == 1) {
			return true;
		}
		return false;
	}

	/*
	 * ����id�����û���¼������һ��User����
	 */
	public User select(String email) throws SQLException {
		// ׼��sqlģ��
		String sql = "select * from user where email =?";
		// ��ȡ����
		Object[] params = { email };
		// �õ�User����
		User user = qr.query(sql, new BeanHandler<User>(User.class), params);
		return user;
	}
	

	/*
	 * ��ѯ�ж����û�
	 */
	public int queryNumber() throws SQLException {
		// ׼��sqlģ��
		String sql = "select count(id) from user";
		// ��ȡnumber
		Number number = qr.query(sql, new ScalarHandler<Integer>());
		// ��ȡint����
		return number.intValue();
	}

	/*
	 * ���ݵ�ǰҳ�����û�������һ������User��List
	 */
	public List<User> find(int page) throws SQLException {
		String sql = "select * from user order by id asc limit ?,?";
		int currentPage = (page - 1) * Page.PAGE_SIZE;
		Object[] params = { currentPage, Page.PAGE_SIZE };
		return qr.query(sql, new BeanListHandler<User>(User.class), params);
	}

	/*
	 * ���������ͳ������ڲ����û�������һ������User��List
	 */
	public List<User> select(String name, java.util.Date birthday)
			throws SQLException {
		String sql = "select * from user where name=? and birthday=?";
		Object[] params = { name, birthday };
		return qr.query(sql, new BeanListHandler<User>(User.class), params);
	}

	/*
	 * ����idɾ��ָ���û�
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
