package com.methods;

public class StackMemoryMechanism {
	
	void m1()
	{
	System.out.println("rattaiah");
	m2();
	}
	void m2()
	{ 
	System.out.println("durga");
	m1();
	}
	public static void main(String[] args)
	{
		StackMemoryMechanism t=new StackMemoryMechanism();
	t.m1();
	}
	
}
//main--->m1--->m2---->durga(m2 method deleted from stack)--->m1 method---ratttish(m1 method deleteed from stack)---main(main method deleteed from stack) stack deleted by jvm