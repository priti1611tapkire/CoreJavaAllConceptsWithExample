package com.methods;

public class MutatorAndAccesor {
	int id;
	static String name;
	String addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		MutatorAndAccesor.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public static void main(String[] args) {
		MutatorAndAccesor m=new MutatorAndAccesor();
		m.setId(1);
		setName("ABC");
		m.setAddr("Pune");
		System.out.println(m.getId());
		System.out.println(getName());
		System.out.println(m.getAddr());
	}
}
