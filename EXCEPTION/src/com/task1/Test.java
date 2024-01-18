package com.task1;

public class Test {

	public static void main(String[] args) {
		
		try{
			System.out.println("OUTER TRY");
			try{
			System.out.println("START try block");
			int i=10/0;
			System.out.println("PRITI");
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("INNER CATCH");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
//			e.getMessage();
//			System.out.println(e.getMessage());
			System.out.println("Catch");
		}
		
	}
}
