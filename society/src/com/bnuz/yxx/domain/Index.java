package com.bnuz.yxx.domain;

public class Index {
	private int id;
	private String name;
	private double weight;
	private String unit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Index() {
		super();
	}

	public Index(int id, String name, double weight, String unit) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Index [id=" + id + ", name=" + name + ", weight=" + weight
				+ ", unit=" + unit + "]";
	}
}
