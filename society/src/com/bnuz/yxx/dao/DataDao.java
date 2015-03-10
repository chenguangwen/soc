package com.bnuz.yxx.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.bnuz.yxx.commons.TxQueryRunner;
import com.bnuz.yxx.domain.Attachment;

public class DataDao {
	private QueryRunner qr = new TxQueryRunner();

	public boolean insert(Attachment at) throws SQLException {
		String sql = "INSERT INTO attac VALUES(?,?,?)";

		boolean judge = false;

		Object[] params = { at.getId(), at.getUserId(), at.getImagePath() };

		if (qr.update(sql, params) == 1) {
			judge = true;
		}
		return judge;
	}
}
