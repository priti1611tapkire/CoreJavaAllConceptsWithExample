package com.throwk;

public class Case1 {
//	static ArithmeticException e=new ArithmeticException();
	static ArithmeticException e;
	public static void main(String[] args) {
		throw e;
	}
}
//default object value for variable is null
//here static variable value is null so thats why here get us nullpointerException
