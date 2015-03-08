package com.bnuz.yxx.commons;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * v1.1
 * @author pomodory
 * 
 */

public class JdbcUtils {
	//配置文件的默认配置，必须给出c3p0-config.xml
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	//提供事务专用的连接
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	/**
	 * 使用连接池返回连接对象
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn = threadLocal.get();
		//conn 不等于null，说明已经调用过beginTransaction()，表示开启了事务
		if(conn != null) {
			return conn;
		}
		return dataSource.getConnection();
	}
	
	/*
	 * 返回池对象
	 */
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	/**
	 * 开启事务
	 * 1.获得一个Connection，设置它的setAutoCommit(false)
	 * 2.保证dao使用的连接是我们刚刚创建的
	 * ----------
	 * 1.创建一个Connction，设置为手动提交
	 * 2.把这个Connection给dao用
	 * 3.还要让commitTransaction和rollbackTransaction使用
	 * @throws SQLException 
	 */
	public static void beginTransaction() throws SQLException {
		Connection conn = threadLocal.get();
		if(conn != null) {
			throw new RuntimeException("已经开启事务，不能重复开启");
		}
		//给conn赋值
		conn = getConnection();		
		//给conn设置为手动提交
		conn.setAutoCommit(false);
		
		threadLocal.set(conn);//把当前线程的连接保存起来
	}
	
	/**
	 * 提交事务
	 * 1.获得beginTransaction提供的Connection, 然后调用rollback方法
	 * @throws SQLException 
	 */
	public static void commitTransaction() throws SQLException {
		Connection conn = threadLocal.get();
		if(conn == null) {
			throw new RuntimeException("还没开启事务，不能提交！");
		}
		//直接使用conn
		conn.commit();
		conn.close();
		
		threadLocal.remove();//从threadLocal中移除
	}
	
	public static void rollbackTransaction() throws SQLException {
		Connection conn = threadLocal.get();
		if(conn == null) {
			throw new RuntimeException("还没开启事务，不能回滚");
		}
		conn.rollback();
		conn.close();
		threadLocal.remove();//从threadLocal中移除
	}
	
	/**
	 * 释放连接
	 * @param conn
	 * @throws SQLException 
	 */
	public static void releaseConnection(Connection connection) throws SQLException {
		Connection conn = threadLocal.get();
		/*
		 * 判断他是不是事务专用，如果是，就不关闭！
		 * 如果不是事务专用，那么就要关闭
		 */
		//如果conn == null,说明现在没有事务，那么connection一定不是事务专用的！
		if(conn == null) connection.close();
		//如果 conn != null,说明有事务，那么需要判断参数是否与conn相等，若不等，说明参数连接不是事务专用连接
		if(conn != connection) connection.close();
	}
}
