package com.defaultexHand;

public class ts {
	public static void main(String[] args) {
		doStuff();
		Object o=new Throwable();
		
		System.out.println(10/0);
	}
	public static void doStuff(){
		doMoreStuff();
		System.out.println("hi");
	}
	public static void doMoreStuff(){
		System.out.println("hello");
	}
}
