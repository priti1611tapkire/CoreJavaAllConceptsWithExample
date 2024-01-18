package com.inehritance;

public class Childs1 extends Parents1{
	int x=52;
	int y=69;
	void andhra()
	{
		System.out.println("division is not possible");
	}

	final void m2(){
		System.out.println("final of child m2");
	}
	public static void main(String[] args)
	{
		Childs1 c=new Childs1();
		c.andhra();
		c.m2();
		System.out.println(c.x);//52
		System.out.println(c.y);//69
		Parents1 c1=new Childs1();
		//REFERANNCE variable=new Constructor class
		c1.andhra();
		c1.m2();
		System.out.println(c1.x);//10
		System.out.println(c1.y);//20
		Parents1 p=new Parents1();
		p.andhra();
		p.m2();
		System.out.println(p.x);//10
		System.out.println(p.y);//20


		int x=50;
		x=x+1;
		System.out.println(x);

		int y=50;
		y=y+1;
		System.out.println(y);
	}
	//METHOD CHECKING ALWAYS START FROM CONSTRUCTOR CLASS REFERNACE
	//VARIABLE CHECKING ALWAYS START WITH REFERNACE CLASS
}
