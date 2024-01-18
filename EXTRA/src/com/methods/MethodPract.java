package com.methods;

public class MethodPract {
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	void m1(char ch,String str)
	{
	System.out.println(ch);//5--a
	System.out.println(str);//6---ratan
	}
	void m2(int a,double d,boolean b)
	{
	System.out.println(a);//7--100
	System.out.println(d);//8--10.8
	System.out.println(b);//9--true
	}
	static void m3(String str)
	{
	System.out.println(str);//10-anu
	}
	static void m4(char ch,char ch1)
	{
	System.out.println(ch);//11--d
	System.out.println(ch1);//12--w
	}
	public static void main(String[] args)
	{
		MethodPract t=new MethodPract();
	System.out.println(t.a);//1--10
	System.out.println(t.b);//2--20
	System.out.println(c);//3---30
	System.out.println(d);//4--40
	t.m1('a',"ratan");
	t.m2(100,10.8,true);
	m3("anu");
	m4('d','w');
	}
}
