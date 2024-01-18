package com.methodoverloadingcases;

public class Test {

	void m1(String s){
		System.out.println("String version");
	}
	void m1(StringBuffer s){
		System.out.println("Stringbuffer   version");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1("MEENU");
		t.m1("SRO");
		//t.m1(null);//ambiguity error becaz String and StringBuffer class on same level so narrowing is not possible
	}
}
