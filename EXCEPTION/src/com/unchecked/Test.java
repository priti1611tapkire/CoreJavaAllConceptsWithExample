package com.unchecked;

public class Test {
	public static void main(String[] args) {
		Test t =new Test();
		t.m1();
	}
	public void m1(){
		System.out.println(10/0);
	}
}
/*output:-Exception in thread "main" java.lang.ArithmeticException: / by zero
at com.unchecked.Test.m1(Test.java:9)
at com.unchecked.Test.main(Test.java:6)*/
