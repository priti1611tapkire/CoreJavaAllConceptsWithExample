package com.NumberFormateException;

public class A {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i=Integer.parseInt("10");
		@SuppressWarnings("unused")
		int j=Integer.parseInt("Ten");
	}
}
/* 	Exception in thread "main" java.lang.NumberFormatException: For input string: "Ten" 
	at java.lang.NumberFormatException.forInputString(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at com.NumberFormateException.A.main(A.java:6)
*/
