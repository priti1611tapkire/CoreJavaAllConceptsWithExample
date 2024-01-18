package com.methods;

public class Mehodcalling {
	void m1()
	{
		m2();
	System.out.println("m1 ratan");//6==name
	}
	void m2()
	{
		m3(100);
	System.out.println("m2 durga");//3==name
	     m3(200);
	}
	void m3(int a)
	{
	    System.out.println(a);//1=100//4=200
	    System.out.println("m3 naresh");//2==name//5==name
	}
	public static void main(String[] args)
	{
		Mehodcalling t=new Mehodcalling();
	  t.m1();
	}
}
