package com.unchecked;

public class Test1 {
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
	
		catch(ArithmeticException e1){
			System.out.println("Ari Ex");
		}
		catch(Exception e){
			System.out.println("Exc");
		}
	}

}
