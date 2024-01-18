package com.thiskeyword;
//to call the current class mehods we have to use this keyword The both examples gives same output(
public class MethodByThisKeyword {
	void m1()
	{
		m2();
		System.out.println("m1 method");
		}
		void m2()
		{
		System.out.println("m2 method");
		}
		public static void main(String[] args)
		{
			MethodByThisKeyword  t=new MethodByThisKeyword ();
		t.m1();
		}
}
