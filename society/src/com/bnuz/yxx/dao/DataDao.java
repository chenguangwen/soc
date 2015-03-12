package com.bnuz.yxx.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import com.bnuz.yxx.commons.CommonUtils;
import com.bnuz.yxx.commons.TxQueryRunner;
import com.bnuz.yxx.domain.Data;
import com.bnuz.yxx.domain.Index;

public class DataDao {
	private QueryRunner qr = new TxQueryRunner();

	public List<Data> selectIndexByYearSchemeClass(int classNum, int year,
			int scheme) throws SQLException {
		StringBuffer sql = new StringBuffer(
				"select * from data, `index` where data.id = `index`.id and data.year=? and data.scheme=? and data.id in (");
		switch (classNum) {
		case 0:
			sql.append("45)");
			break;
		case 1:
			sql.append("1, 2, 3, 4, 5, 6, 7, 8, 9)");
			break;
		case 2:
			sql.append("10, 11, 12, 13)");
			break;
		case 3:
			sql.append("14, 15, 16, 17, 18)");
			break;
		case 4:
			sql.append("19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32)");
			break;
		case 5:
			sql.append("33, 34, 35, 36, 37, 38, 39)");
			break;
		}
		List<Map<String, Object>> mapList = qr.query(sql.toString(),
				new MapListHandler(), year, scheme);
		List<Data> dataList = new ArrayList<Data>();
		for (Map<String, Object> map : mapList) {
			Data data = CommonUtils.toBean(map, Data.class);
			Index index = CommonUtils.toBean(map, Index.class);
			data.setIndex(index);
			dataList.add(data);
		}
		return dataList;
	}

	public List<Data> selectClassIndexByYearAndScheme(int classNum, int year,
			int scheme) throws SQLException {
		switch (classNum) {
		case 1:
			classNum = 40;
			break;
		case 2:
			classNum = 41;
			break;
		case 3:
			classNum = 42;
			break;
		case 4:
			classNum = 43;
			break;
		case 5:
			classNum = 44;
			break;
		}
		String sql = "select * from data, `index` where data.id = `index`.id and data.id = ? and data.year=? and data.scheme=?";
		List<Map<String, Object>> mapList = qr.query(sql, new MapListHandler(),
				classNum, year, scheme);
		List<Data> dataList = new ArrayList<Data>();
		for (Map<String, Object> map : mapList) {
			Data data = CommonUtils.toBean(map, Data.class);
			Index index = CommonUtils.toBean(map, Index.class);
			data.setIndex(index);
			dataList.add(data);
		}
		return dataList;
	}

	@Test
	public void fun() throws SQLException {
		// List<Data> list = selectClassIndexByYearAndScheme(1, 2010, 1);
		// List<Data> list = selectByYearScheme(2010, 1);
		List<Data> list = selectIndexByYearSchemeClass(2, 2011, 2);
		for (Data data : list) {
			System.out.println(data);
		}

	}
}
