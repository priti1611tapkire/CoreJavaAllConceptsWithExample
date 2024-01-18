package com.methodoverloadingcases;

public class A {

	void m1(int a,float b){
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1(15, 15.5f);
	}
}
