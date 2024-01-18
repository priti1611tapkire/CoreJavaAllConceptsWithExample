package com.IlligalArgumentException;

public class A {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.setPriority(10);
		t.setPriority(100);
	}
}
/*Exception in thread "main" java.lang.IllegalArgumentException
	at java.lang.Thread.setPriority(Unknown Source)
	at com.IlligalArgumentException.A.main(A.java:8)
*/
