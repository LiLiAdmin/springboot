package com.wojia.pojo;

public class Account {
	private int id;
	private String name;
	private double money;
	private String img;

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

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Account(int id, String name, double money, String img) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.img = img;
	}

	public Account(int id, String name, double money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}

	public Account() {
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", name='" + name + '\'' +
				", money=" + money +
				'}';
	}
}
