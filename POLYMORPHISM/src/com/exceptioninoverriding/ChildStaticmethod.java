package com.exceptioninoverriding;
//static method dosen't override following ex. seems like overriding but its actually a method hiding
public class ChildStaticmethod extends StaticMethod {
//public void m1(){
//	// 1st case This instance method cannot override the static method from 
//	 StaticMethod
//}
	
//	public static void m1(){
//	//2nd case This static method cannot hide the instance method from StaticMethod
//}
	
	public static void m1(){
		//3rdcase
		//but this is not method overriding this is method hiding
		System.out.println("child static");
		}
	public static void main(String[] args) {
	//	StaticMethod s=new ChildStaticmethod();
		StaticMethod.m1();//parent
		// ChildStaticmethod s1=new ChildStaticmethod();
		ChildStaticmethod.m1();//child
		// StaticMethod s2=new StaticMethod();
		StaticMethod.m1();//parent	 
	}
}
