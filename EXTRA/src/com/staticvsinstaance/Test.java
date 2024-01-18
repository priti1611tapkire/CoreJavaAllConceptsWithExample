package com.staticvsinstaance;

public class Test {
	//STATIC VARIABLE
	//	static int x=100;
	//	static int a=10;
	//	static int b=20;
	//	void add()
	//	{
	//	System.out.println(a+b);
	//	}
	//	public static void main(String[] args)
	//	{
	//	//1-way(directly possible)
	//	System.out.println(x);
	//	//2-way(By using class name)
	//	System.out.println(Test.x);
	//	//3-way(By using reference variable)
	//	Test t=new Test();
	//	System.out.println(t.x);
	//	System.out.println(a+b);
	//	}
	//==========================================
	//LOCAL VARIABLE
	//	int a=10;
	//	int b=20;
	//	void add()
	//	{
	//	System.out.println(a+b);
	//	}
	//	public static void main(String[] args)
	//	{
	//	Test t=new Test();
	//	System.out.println(t.a+t.b);
	//	t.add();
	//	}	
	//===============================================
	//}

	//	int a=10;
	//	static int b=20;
	//	public static void main(String... ratan)
	//	{
	//	
	//	Test t1=new Test();
	//	System.out.println(t1.a);//10
	//	System.out.println(t1.b);//20
	//	//t1.a=444;
	//	t1.b=555;
	//	Test t2=new Test();
	//	System.out.println(t2.a);//10
	//	System.out.println(t2.b);//555
	//	t2.b=111;
	//	System.out.println(t2.b);//111
	//	Test t3=new Test();
	//	System.out.println(t3.a);//10
	//	System.out.println(t3.b);//111
	//	Test t4=new Test();
	//	System.out.println(t4.a);//10
	//	System.out.println(t4.b);//111

	//2-instance variables
	//	int a=10;
	//	boolean b;
	//	//2-static variables
	//	static int c=20;
	//	static double d;
	//	//1-instance methods
	//	void m1()
	//	{
	//	System.out.println(a);//10
	//	System.out.println(b);//false
	//	System.out.println(c);//20
	//	System.out.println(d);//0.0
	//	}
	//	//1-static method
	//	static void m2()
	//	{
	//	Test t=new Test();
	//	System.out.println(t.a);//10
	//	System.out.println(t.b);//false
	//	System.out.println(c);//20
	//	System.out.println(d);//0.0
	//	}
	//	public static void main(String[] args)
	//	{
	//	Test t=new Test();
	//	t.m1();
	//	m2();
	//	}

	//	int x=50;
	//	static{
	//		int x=100;
	//	}
	//	
	//	public static void main(String[] args) {
	//		Test t=new Test();
	//		System.out.println(t.x);
	//		System.out.println(Test.x);
	//	}
	//int x=50;
	int b=100;
	static int x=80;


	void m1(){
		//int b=150;
		//int x=60;
		m2();
		System.out.println(b);
		System.out.println(x);//
	}
	static void m2(){
		System.out.println("================");
		System.out.println(x);
	
	}
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.x);
		System.out.println(t.b);
		t.m1();
		t.m2();


	}
}
