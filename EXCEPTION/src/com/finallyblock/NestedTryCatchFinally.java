package com.finallyblock;

public class NestedTryCatchFinally {
public static void main(String[] args) {
	try{
		System.out.println("outer try");
		try{
			System.out.println("inner try");
			System.out.println(10/0);
		}catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("inner catch");
		}
		finally{
			System.out.println("inner finally");
		}
		System.out.println("oyter try catch");
	}catch(Exception e1){
		e1.printStackTrace();
		System.out.println("outer catch");
	}
	finally {
		System.out.println("outer finally");
	}
}
}
