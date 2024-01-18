package com.methods;

public class ReturnTypemethod {
	static int add(int a,int b)
	{
	int c=a+b;
	return c;//30
	}
	static float mul(int a,int b)
	{
	int c=a*b;
	return c;//20000
	}
	public static void main(String[] args)
	{
	int a=add(10,20);
	System.out.println(a);
	float b=mul(100,200);
	System.out.println(b);
	}
}
