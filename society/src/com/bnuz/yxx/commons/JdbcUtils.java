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
	//�����ļ���Ĭ�����ã��������c3p0-config.xml
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	//�ṩ����ר�õ�����
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	/**
	 * ʹ�����ӳط������Ӷ���
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn = threadLocal.get();
		//conn ������null��˵���Ѿ����ù�beginTransaction()����ʾ����������
		if(conn != null) {
			return conn;
		}
		return dataSource.getConnection();
	}
	
	/*
	 * ���سض���
	 */
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	/**
	 * ��������
	 * 1.���һ��Connection����������setAutoCommit(false)
	 * 2.��֤daoʹ�õ����������Ǹոմ�����
	 * ----------
	 * 1.����һ��Connction������Ϊ�ֶ��ύ
	 * 2.�����Connection��dao��
	 * 3.��Ҫ��commitTransaction��rollbackTransactionʹ��
	 * @throws SQLException 
	 */
	public static void beginTransaction() throws SQLException {
		Connection conn = threadLocal.get();
		if(conn != null) {
			throw new RuntimeException("�Ѿ��������񣬲����ظ�����");
		}
		//��conn��ֵ
		conn = getConnection();		
		//��conn����Ϊ�ֶ��ύ
		conn.setAutoCommit(false);
		
		threadLocal.set(conn);//�ѵ�ǰ�̵߳����ӱ�������
	}
	
	/**
	 * �ύ����
	 * 1.���beginTransaction�ṩ��Connection, Ȼ�����rollback����
	 * @throws SQLException 
	 */
	public static void commitTransaction() throws SQLException {
		Connection conn = threadLocal.get();
		if(conn == null) {
			throw new RuntimeException("��û�������񣬲����ύ��");
		}
		//ֱ��ʹ��conn
		conn.commit();
		conn.close();
		
		threadLocal.remove();//��threadLocal���Ƴ�
	}
	
	public static void rollbackTransaction() throws SQLException {
		Connection conn = threadLocal.get();
		if(conn == null) {
			throw new RuntimeException("��û�������񣬲��ܻع�");
		}
		conn.rollback();
		conn.close();
		threadLocal.remove();//��threadLocal���Ƴ�
	}
	
	/**
	 * �ͷ�����
	 * @param conn
	 * @throws SQLException 
	 */
	public static void releaseConnection(Connection connection) throws SQLException {
		Connection conn = threadLocal.get();
		/*
		 * �ж����ǲ�������ר�ã�����ǣ��Ͳ��رգ�
		 * �����������ר�ã���ô��Ҫ�ر�
		 */
		//���conn == null,˵������û��������ôconnectionһ����������ר�õģ�
		if(conn == null) connection.close();
		//��� conn != null,˵����������ô��Ҫ�жϲ����Ƿ���conn��ȣ������ȣ�˵���������Ӳ�������ר������
		if(conn != connection) connection.close();
	}
}
