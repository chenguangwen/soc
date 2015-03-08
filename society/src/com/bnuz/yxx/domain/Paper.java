package com.bnuz.yxx.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paper {
	private int id;
	private int userId;
	private String title;
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		String s = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		Date dd = null;
		// 对日期进行处理，将String格式化成java.util.Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dd = sdf.parse(s);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		this.date = dd;
	}

	public Paper(int id, int userId, String title, Date date, int imageId) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.date = date;

	}

	@Override
	public String toString() {
		return "Paper [id=" + id + ", userId=" + userId + ", title=" + title
				+ ", date=" + date + "]";
	}

	public Paper() {
		super();
	}

}
