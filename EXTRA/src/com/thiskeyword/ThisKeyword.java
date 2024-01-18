package com.thiskeyword;

public class ThisKeyword {
//without using this keyword convertion of local variables into the instance/static variables
//	static int i;
//	int j;
//	void values(int a,int b)
//	{
//	i=a;
//	j=b;
//	System.out.println(i);//100
//	System.out.println(j);//200
//	}
//	void add()
//	{
//	System.out.println(i+j);//300
//	}
//	void mul()
//	{
//	System.out.println(i*j);//20000
//	}
//	public static void main(String[] args)
//	{
//		ThisKeyword t=new ThisKeyword();
//	t.values(100,200);
//	t.add();
//	t.mul();
//	}
	
	//===================================================================
	//to convert local variables into the instance/static variables need of this keyword.
	static int a;
	int b;
	void values(int a,int b)
	{
	this.a=a;
	this.b=b;
	System.out.println(a);//100
	System.out.println(b);//200
	}
	void add()
	{
	System.out.println(a+b);//300
	}
	void mul()
	{
	System.out.println(a*b);//20000
	}
	public static void main(String[] args)
	{
		ThisKeyword t=new ThisKeyword();
	t.values(100,200);
	t.add();
	t.mul();
	}
}
