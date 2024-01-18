package com.mainmethod;

public class B extends A {
	public void m1(){
		System.out.println("B---M1");
	}
	public static void main(String[] args) {
		System.out.println("B");
		A a=new B();
		a.m1();
	}
	
}
