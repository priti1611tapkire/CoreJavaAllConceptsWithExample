package Explanantions;

public class A {

	public A(){
		this(10.5f);
		System.out.println("no arg constructor");
	}
	public A(int x){
		this();
		System.out.println("int arg constructor");
	}
	
	public A(double d){
		System.out.println("double arg constructor");
	}
}
