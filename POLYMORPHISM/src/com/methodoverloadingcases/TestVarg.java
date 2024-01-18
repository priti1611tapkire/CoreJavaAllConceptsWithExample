package com.methodoverloadingcases;

public class TestVarg {
	void m1(int i){
		System.out.println("generic method");
	}
	void m1(int...x){
		System.out.println("vararg method");
	}
	public static void main(String[] args) {
		TestVarg t=new TestVarg();
		t.m1();
		t.m1(10);
		t.m1(10,10,50);
		t.m1(10,60);
	}
}
