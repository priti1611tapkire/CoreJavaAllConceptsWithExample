package com.mainmethod;

public class A {
	
	public static void main(int[] args) {
		System.out.println("int");
	}
	public void m1(){
		System.out.println("A---M1");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println("A");
	//	double g=10;
	//	System.out.println(g);
		Object o=Class.forName(args[0]).newInstance();
		System.out.println(o);
		//B b=new B();
	//	System.out.println(b);
	
	} 
	
	
}
