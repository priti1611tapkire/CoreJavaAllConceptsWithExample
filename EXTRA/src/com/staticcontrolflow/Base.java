package com.staticcontrolflow;

public class Base {
	static int i=10;
	static{
		
		System.out.println("first static block");
		System.out.println(i);
		
	}
	public static void m1(){
		System.out.println(j);
	}
	public static void main(String[] args) {
		Base b=new Base();
	b.m1();
		System.out.println("main method");
		
	}
	
	static{
		System.out.println("second static block");
	}
	static int j=50; 
	
}
