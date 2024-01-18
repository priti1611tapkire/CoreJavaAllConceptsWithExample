package com;

public class A {
public static void main(String[] args) {
//	String s1=new String("Priti");
//	String s2=new String("Priti");
//	System.out.println(s1.equals(s2));//true
//	System.out.println(s1.hashCode());//77382460
//	System.out.println(s2.hashCode());//77382460
//	
//	String s1=new String("Priti");
//     String s2=s1;
//     System.out.println(s1.equals(s2));//true
// 	System.out.println(s1.hashCode());//77382460
// 	System.out.println(s2.hashCode());//77382460
	
	Student s1=new Student("Priti");
	//Student s2=new Student("Priti");
	Student s2=s1;
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.hashCode());//77382460
	System.out.println(s2.hashCode());//77382460
}
}
