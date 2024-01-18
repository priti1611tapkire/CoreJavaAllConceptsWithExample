package com.staticcontrolflow;

public class DirectAndIndirecRead {

	static int i=10;
	static{
		m1();
		System.out.println(i);
	}
	public static void m1(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		DirectAndIndirecRead d=new DirectAndIndirecRead();
		System.out.println(d);
	}
}
