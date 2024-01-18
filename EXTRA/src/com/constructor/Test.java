package com.constructor;

public class Test {
//	Test()
//	{
//	System.out.println("this is zero argument constructor");
//	}
//	Test(int i)
//	{
//	System.out.println(i); 
//	}
//	Test(int i,String str)
//	{ System.out.println(i);
//	System.out.println(str);
//	}
//	
//	public static void main(String[] args)
//	{
//	Test t1=new Test();
//	Test t2=new Test(10);
//	Test t3=new Test(100,"rattaiah");
//	}
	//2-instance variables
	int a=1000;
	int b=2000;
	//2-static variables
	static int c=3000;
	static int d=4000;
	//2-instance methods
	void m1(int a,char ch)
	{
	System.out.println(a);
	System.out.println(ch);
	}
	void m2(int a,int b,int c)
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	//2-static methods
	static void m3(String str)
	{
	System.out.println(str);
	}
	static void m4(String str1,String str2)
	{
	System.out.println(str1);
	System.out.println(str2);
	}
	//2-constructors
	Test(char ch,boolean b)
	{
	System.out.println(ch);
	System.out.println(b);
	}
	Test(int a)
	{
	System.out.println(a);
	}
	public static void main(String[] args) {
		
	
		//calling of constructors
		Test t1=new Test('s',true);
		Test t2=new Test(10);
		//calling of instance variables
		System.out.println(t1.a);
		System.out.println(t2.b);
		//calling of static variables
		System.out.println(c);
		System.out.println(d);
		//calling of instance methods
		t1.m1(100,'s');
		t1.m2(100,200,300);
		//calling of static methods
		m3("durga");
		m4("anu","dhanu");
		}
	
}
