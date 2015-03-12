package com.bnuz.yxx.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.bnuz.yxx.dao.DataDao;
import com.bnuz.yxx.domain.Data;

public class DataService {
	private DataDao dataDao = new DataDao();

	public List<Data> selectTableByYearScheme(int year, int scheme) {
		List<Data> dataList = new ArrayList<Data>();
			try {
				dataList.addAll(dataDao.selectIndexByYearSchemeClass(0, year, scheme));
				for(int i = 1; i < 6; i++){
				dataList.addAll(dataDao.selectClassIndexByYearAndScheme(i, year, scheme));
				dataList.addAll(dataDao.selectIndexByYearSchemeClass(i, year, scheme));
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		return dataList;
	}
	@Test
	public void fun() {
		List<Data> list = selectTableByYearScheme(2010, 2);
		for(Data data : list) {
			System.out.println(data);
		}
	}

}
