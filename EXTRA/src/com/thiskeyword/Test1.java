package com.thiskeyword;

public class Test1 {


	int a=10;
	int b=20;
	void add(int a,int b){
		//void add(int i,int j){
		System.out.println(a+b);//30 --->300 with this
		//System.out.println(i+j);//300
		System.out.println(this.a+this.b);//--->30
	}
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.add(100,200);
	}
}
