package com;

public class Test {
	// Main thread is Running
	public static void main(String[] args) {
		
		new MyNewThread("One");
		
		try {
			Thread.sleep(15000);
			
		}catch (InterruptedException e) {
		System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Main Thrad Is Exiting");
		System.out.println(" Check Thread : " +Thread.activeCount());
	}
}
