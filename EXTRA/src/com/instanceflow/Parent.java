package com.instanceflow;

public class Parent {
int x=10;
{
	m1();
	System.out.println("Parent class instance block");
}
public Parent() {
	// TODO Auto-generated constructor stub
	System.out.println("parent class constructor block");
}
public static void main(String[] args) {
	Parent p=new Parent();
	System.out.println("parent class main method");
}
public void m1(){
	System.out.println(y);
}
int y=20;
}
