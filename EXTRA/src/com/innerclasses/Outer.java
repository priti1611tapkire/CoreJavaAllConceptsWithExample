package com.innerclasses;

public class Outer {

	class Inner{
	public void m1()	{
		System.out.println("inner m1");
	}
	}
	public void m2()
	{
		Inner i=new Inner();
		i.m1();
		
	}
	public static void main(String[] args) {
		Outer i=new Outer();
		i.m2();
		
		System.out.println("outer main");
	}
}
