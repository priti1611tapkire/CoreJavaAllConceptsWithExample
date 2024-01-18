package com;

public class MyThraed extends Thread {
	//	public void run(){
	//		System.out.println("no arg method");//OUTPUT
	//	} 
	//public void run(int i){
	//	System.out.println("int arg method");
	//}
//	public void start()
//	{
//		super.start();
//		System.out.println("start method");
//	}
	public void run()
	{
		
		//Thread.currentThread().setName("Priti");
//		Thread.currentThread().setPriority(MAX_PRIORITY);
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("child thread method"+Thread.currentThread().getName());
		for(int i=0;i<10;i++){
		System.out.println("run method");
		//System.out.println(10/0);
		}
	}
}
