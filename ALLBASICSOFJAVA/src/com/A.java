package com;

public class A {
	public void sum(){
		System.out.println("HELLO");
	}
	public static void main(String[] args) {
		System.out.println("MAIN");
		A a=new A();
		a.sum();
	}

}
