package com.task1;

public class A {
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("in cstch");
		}
		finally {
			System.out.println("im in finally block");
		}
		System.out.println("out of block");
	}

}
