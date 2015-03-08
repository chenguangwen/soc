package com.bnuz.yxx.service;

import java.sql.SQLException;
import java.util.List;

import com.bnuz.yxx.dao.PaperDao;
import com.bnuz.yxx.domain.Paper;

public class PaperService {
	private PaperDao paperDao = new PaperDao();

	/*
	 * 将paper插入数据库
	 */

	public boolean insert(Paper paper) {
		boolean judge = false;

		try {
			judge = paperDao.insert(paper);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return judge;
	}

	/*
	 * 查找所有论文
	 */
	public List<Paper> select() {
		List<Paper> list = null;

		try {
			list = paperDao.select();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	/*
	 * find the user's paper accoriding id
	 */
	public List<Paper> select(int id) {
		List<Paper> list = null;

		try {
			list = paperDao.select(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/*
	 * find paper according page
	 */
	public List<Paper> selectAll(int currentPage) {
		List<Paper> list = null;

		try {
			list = paperDao.selectAll(currentPage);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/*
	 * find the user's paper according page
	 */
	public List<Paper> selectAllById(int id, int page) {
		List<Paper> list = null;

		try {
			list = paperDao.selectAllById(id, page);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/*
	 * select the count of paper
	 */
	public int countAllPaer() {
		int count;

		try {
			count = paperDao.countAllPaer();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

	/*
	 * select the number of user's paper
	 */
	public int countAllPaerById(int id) {
		int count;

		try {
			count = paperDao.countAllPaerById(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

}
