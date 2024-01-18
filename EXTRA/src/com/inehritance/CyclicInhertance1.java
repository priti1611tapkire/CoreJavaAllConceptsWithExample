package com.inehritance;
//just names is here no cyclic ref
public class CyclicInhertance1 extends CyclicInhertance {
	void m1(){
		System.out.println("not final m1");
	}
	public static void main(String[] args) {
		int a=100;
		FinalClass f=new FinalClass();
		System.out.println(f.a);
		f.m1();
	
	}
}
