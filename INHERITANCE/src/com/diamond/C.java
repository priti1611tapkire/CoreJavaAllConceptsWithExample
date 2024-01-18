package com.diamond;

public class C extends B {
	public void add(){
		super.add();
		System.out.println("add of claas C");
	}
	public static void main(String[] args) {
		C c=new C();
		c.add();
	}
}
