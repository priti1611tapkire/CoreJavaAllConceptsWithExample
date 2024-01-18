package com.throwsk;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}
	public static void doStuff() throws InterruptedException {
		//try{
			System.out.println("hello");
			doMoreStuff();
			System.out.println("Gm");
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("catch doStuff");
//		}
}
	public static void doMoreStuff() throws InterruptedException  {
		Thread.sleep(1000);
		System.out.println("zop zop");
	}
}
