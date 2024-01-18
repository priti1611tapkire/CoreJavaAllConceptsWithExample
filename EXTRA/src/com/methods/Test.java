package com.methods;
//STATIC AND NONSTATIC METHOD




public class Test {
	//METHOD WITHOUT ARGUMENT
//	void durga()
//	{
//	System.out.println("durgasoftware solutions");
//	}
//	void soft()
//	{
//	System.out.println("software solutions");
//	}
//	public static void main(String[] args)
//	{
//	Test t=new Test();
//	t.durga();
//	t.soft();
//	}
	//============================================================
	//METHOD WITH ARGUMENT
//	
//	 void m1(int i,char ch)
//	{
//	System.out.println(i+"-------"+ch);
//	}
//	 void m2(float f,String str)
//	{
//	System.out.println(f+"------"+str);
//	}
//	public static void main(String[] args)
//	{
//		Test t=new Test();
//		
//	t.m1(10,'a');
//	t.m2(10.2f,"ratna");
//	}
	
	//=========================================
	
	//static methods without parameters.
	
//	static void durga()
//	{
//	System.out.println("durgasoftware solutions");
//	}
//	static void soft()
//	{
//	System.out.println("software solutions");
//	}
//	public static void main(String[] args)
//	{
//	durga();
//	soft();
//	}
	//======================================================
	//static methods with parameters
	
//	static void m1(int i,char ch)
//	{
//	System.out.println(i+"-------"+ch);
//	} 
//	static void m2(float f,String str)
//	{
//	System.out.println(f+"------"+str);
//	}
//	public static void main(String[] args)
//	{
//	m1(10,'a');
//	m2(10.2f,"ratna");
//	}
	
	
	void m1(int a,int b)
	{
	System.out.println(a);
	System.out.println(b);
	}
	void m2(boolean b1)
	{
	System.out.println(b1);
	}
	public static void main(String[] args)
	{
	int a=10;
	int b=20;
	boolean b1=true;
	Test t=new Test();
	t.m1(a,b);
	t.m2(b1);
	}
}
