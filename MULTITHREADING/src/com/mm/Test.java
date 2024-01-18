package com.mm;

public class Test {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
		System.out.println("Its me Prit");
	}
}
