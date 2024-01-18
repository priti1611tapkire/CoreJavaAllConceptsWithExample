package com;

public class Student {
	private int id;

	private String name;

	private final String cardnumber="SBI1234567";

	public String getCardnumber() {
		return cardnumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id1) {
		this.id = id1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cardnumber=" + cardnumber + "]";

	}

}
