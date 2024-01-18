package com.methodsignature;

public class A {
	public void m1(int i){
		System.out.println("int args");
	}
	public void m1(String j){
		System.out.println("strin arg");

	}
	public void m1( float f){
		System.out.println("float arg");

	}
	public void m1(double j){
		System.out.println("double arg");

	}
	public static void main(String[] args) {
		A a=new A();
		a.m1(20);
		a.m1("Rushi");
		a.m1('a');
		a.m1(10l);
	}
}
