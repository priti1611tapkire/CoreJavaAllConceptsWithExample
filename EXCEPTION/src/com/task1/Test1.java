package com.task1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main---start");
		try{
			System.out.println("try start");
		System.out.println(10/0);
		System.out.println("try end");
		}
		catch(ArithmeticException e){
			System.out.println("catch block");
		}
		System.out.println("main end");
		
	}

}
