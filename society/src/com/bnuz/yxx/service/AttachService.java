package com.bnuz.yxx.service;

import java.sql.SQLException;

import com.bnuz.yxx.dao.AttacDao;
import com.bnuz.yxx.domain.Attachment;

public class AttachService {
	private AttacDao attacDao = new AttacDao();

	public boolean insert(Attachment attac) {
		boolean judge = false;

		try {
			judge = attacDao.insert(attac);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return judge;
	}
}
