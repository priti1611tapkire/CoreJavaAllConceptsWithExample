package com;

public class ThreadDemo1 {
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread();
		Thread t1=new Thread(r);
//		t.start();
//		t1.start();
		r.run();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
}
