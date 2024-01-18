package com.accessmodifieroverroide;

class C extends CPrivate{
	private void m1(){
		System.out.println("Child");
	}
	public static void main(String[] args) {
		C c=new C();
		
		c.m1();
	}
}
