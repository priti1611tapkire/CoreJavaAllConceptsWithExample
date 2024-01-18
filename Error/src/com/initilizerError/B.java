package com.initilizerError;

public class B {
	static{
		String s=null;
		System.out.println(s.length());
	}
	public static void main(String[] args) {

	}
}
/*Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NullPointerException
	at com.initilizerError.B.<clinit>(B.java:6)
*/