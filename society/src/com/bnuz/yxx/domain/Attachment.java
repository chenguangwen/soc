package com.bnuz.yxx.domain;

public class Attachment {
	private int id;
	private int userId;
	private String imagePath;

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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Attachment(int id, int userId, String imagePath) {
		super();
		this.id = id;
		this.userId = userId;
		this.imagePath = imagePath;
	}

	public Attachment() {
		super();
	}

}
