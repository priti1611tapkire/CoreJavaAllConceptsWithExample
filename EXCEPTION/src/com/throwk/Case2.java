package com.throwk;

public class Case2 {
	public static void main(String[] args) {
//		System.out.println(10/0);
//		System.out.println("hello");     //previous code
		
		
		throw new ArithmeticException("/by zero");//expliciltly we write exception here and compiler also available
//		System.out.println("hello");//unreachable code
	}
}
