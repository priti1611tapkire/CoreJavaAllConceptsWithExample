package com;

public class Test {
public static void main(String...strings) {
	A a=new B(); 
	a.m1();
	System.out.println(a.x);
	B b=new B();
	 b.m1();
	 b.m2();
	 System.out.println(b.x);
}
}
