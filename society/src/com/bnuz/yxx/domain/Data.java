package com.bnuz.yxx.domain;

public class Data {
	private Index id;
	private int year;
	private int scheme;
	private double completeValue;
	private double degreeOfCompletion;

	public Index getId() {
		return id;
	}

	public void setId(Index id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getScheme() {
		return scheme;
	}

	public void setScheme(int scheme) {
		this.scheme = scheme;
	}

	public double getCompleteValue() {
		return completeValue;
	}

	public void setCompleteValue(double completeValue) {
		this.completeValue = completeValue;
	}

	public double getDegreeOfCompletion() {
		return degreeOfCompletion;
	}

	public void setDegreeOfCompletion(double degreeOfCompletion) {
		this.degreeOfCompletion = degreeOfCompletion;
	}

	public Data() {
		super();
	}

	public Data(Index id, int year, int scheme, double completeValue,
			double degreeOfCompletion) {
		super();
		this.id = id;
		this.year = year;
		this.scheme = scheme;
		this.completeValue = completeValue;
		this.degreeOfCompletion = degreeOfCompletion;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", year=" + year + ", scheme=" + scheme
				+ ", completeValue=" + completeValue + ", degreeOfCompletion="
				+ degreeOfCompletion + "]";
	}
}
