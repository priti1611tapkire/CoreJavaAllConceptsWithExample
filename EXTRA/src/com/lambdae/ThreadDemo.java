package com.lambdae;

public class ThreadDemo
{
	
	public static void main(String[] args) {
//		MyRunnable r=new MyRunnable();
//		Thread t=new Thread(r);
//		t.start();
//		for(int i=0; i<10; i++){
//			System.out.println("main thread");
//		}
		Runnable r=()->{
			for(int i=0; i<10;i++){
				System.out.println("child thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("main thread");
		}
	}
}