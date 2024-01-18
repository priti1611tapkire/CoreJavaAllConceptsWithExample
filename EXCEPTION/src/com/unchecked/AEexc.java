package com.unchecked;

public class AEexc {

	public static void main(String[] args) {

		System.out.println("hello");
		try{
			System.out.println("in try");
			System.out.println(10/0);
			System.out.println("after Exce");
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			//			System.out.println(e.toString());
			//		System.out.println(e);
			//			System.out.println(e.getMessage());
			System.out.println("in catch");
			//			try{
			//			System.out.println();
			//			}
			//			catch(NullPointerException e1){
			//				e1.printStackTrace();
			//				System.out.println("IN Catch ctach");
			//			}
		}

		System.out.println("bbye");

	}
}
