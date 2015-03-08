package com.bnuz.yxx.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.bnuz.yxx.commons.TxQueryRunner;
import com.bnuz.yxx.domain.Page;
import com.bnuz.yxx.domain.Paper;

public class PaperDao {
	private QueryRunner qr = new TxQueryRunner();

	/*
	 * 根据Paper对象属性插入paper表
	 */
	public boolean insert(Paper paper) throws SQLException {
		// 准备插入语句模板
		String sql = "insert into paper values(?,?,?,?)";
		// 获取参数
		Object[] params = {paper.getId(), paper.getTitle(), paper.getDate(), paper.getUserId()};
		// 执行并判断是否成功
		if (qr.update(sql, params) == 1) {
			return true;
		}
		return false;
	}

	/*
	 * 查找所有论文
	 */
	public List<Paper> select() throws SQLException {
		String sql = "select * from paper";
		return qr.query(sql, new BeanListHandler<Paper>(Paper.class));
	}
	
	/*
	 * find the user's paper according id
	 */
	public List<Paper> select(int id) throws SQLException {
		String sql = "SELECT * FROM paper where id=?";
		
		return qr.query(sql, new BeanListHandler<Paper>(Paper.class), id);
	}

	/*
	 * find all user's paper according page
	 */
	public List<Paper> selectAll(int page) throws SQLException {
		String sql = "select * from paper order by id asc limit ?,?";
		int currentPage = (page - 1) * Page.PAGE_SIZE;
		Object[] params = {currentPage, Page.PAGE_SIZE};
		return qr.query(sql, new BeanListHandler<Paper>(Paper.class), params);
	}
	

	/*
	 * find the user's paper according page
	 */
	public List<Paper> selectAllById(int id, int page) throws SQLException {
		String sql = "select * from paper where userId=? limit ?,?";
		int currentPage = (page - 1) * Page.PAGE_SIZE;
		Object[] params = {id, currentPage, Page.PAGE_SIZE};
		return qr.query(sql, new BeanListHandler<Paper>(Paper.class), params);
	}
	
	/*
	 * select the count of paper
	 */
	public int countAllPaer() throws SQLException {
		String sql = "SELECT COUNT(id) FROM paper";
		
		Number number = qr.query(sql, new ScalarHandler<Integer>());
		
		return number.intValue();
	}
	
	/*
	 * select the number of user's paper 
	 */
	public int countAllPaerById(int id) throws SQLException {
		String sql = "SELECT COUNT(ID) FROM paper WHERE userId=?";
		
		Number number = qr.query(sql, new ScalarHandler<Integer>(), id);
		
		return number.intValue();
	}
	
	@Test
	public void fun() throws SQLException {
		List<Paper> list = selectAllById(13, 1);
		for(Paper p : list){
			System.out.println("adfadfadf" + p);
		}
	}
	
}


