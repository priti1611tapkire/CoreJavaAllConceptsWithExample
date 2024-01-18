package com.innerclasses;

import com.innerclasses.Outer1.Inner;

public class Test {
	public static void main(String[] args) {
		new Outer1().new Inner().m1();
		
		Outer1 o=new Outer1();
		Inner o1 = o.new Inner();
		
		o1.m1();
	}
}
