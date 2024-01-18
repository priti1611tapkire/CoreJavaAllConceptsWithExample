package com;

public class ThreadDemo {
	public static void main(String[] args) {
	
		//t.start();
		Thread.currentThread().setPriority(7);
		MyThraed t=new MyThraed();
		System.out.println("child" +t.getPriority());
	System.out.println("main method" +Thread.currentThread().getName());
	System.out.println("main method priority" +Thread.currentThread().getPriority());
//		for(int i=0;i<10;i++){
//			System.out.println("main method");	
//		}
		
	}
}
