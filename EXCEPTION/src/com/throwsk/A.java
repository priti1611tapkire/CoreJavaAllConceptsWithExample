package com.throwsk;


public class A {
	public void m1() throws InterruptedException  {
		
		try{
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("catch of m1");
		}
		m2();
	}
	public void m2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("thread");
		
	}
	public static void main(String[] args) throws InterruptedException{
		A a=new A();
		a.m1();
		a.m2();
	}
	
}
