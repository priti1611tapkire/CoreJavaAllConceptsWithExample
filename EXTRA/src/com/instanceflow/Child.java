package com.instanceflow;

public class Child extends Parent{
	int i=100;
	{
		m2();
		System.out.println("child first instance block");
	}
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("child class constructor");
	}
	public static void main(String[] args) {
		//Child c=new Child();
	Parent p=new Child();
		System.out.println("child class main method");
	}
	public void m2(){
		System.out.println(j);
	}
	{
		System.out.println("child class instance block");
	}
	int j=200;
}
