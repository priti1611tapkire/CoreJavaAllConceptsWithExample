package com.innerclasses;

public class A {
 class B{
	 class C{
		 class D{
			 public void m1(){
				System.out.println("inner class D"); 
			 }
		 }
	 }
 }
 public static void main(String[] args) {
	new A().new B().new C().new D().m1();
	//or
	
	A a=new A();
	A.B b=a.new B();
	A.B.C c=b.new C();
	A.B.C.D d=c.new D();
	d.m1();
	}
}
