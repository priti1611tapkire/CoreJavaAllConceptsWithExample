package com.methodsignature;

public class TestDoubleArg {

	void m1(int i, float f){
		System.out.println("int float");
	}
	void m1( float f, int i){
		System.out.println("float int ");
	}
	public static void main(String[] args) {
		TestDoubleArg t=new TestDoubleArg();
		t.m1(10, 10.5f);
		t.m1(10.5f, 10);
	//	t.m1(10, 10);//The method m1(int, float) is ambiguous for the type TestDoubleAr
	//  	t.m1(10.5f, 10.5f);//The method m1(float, int) in the type TestDoubleArg is not applicable for the arguments (float, float)
	}
}
 