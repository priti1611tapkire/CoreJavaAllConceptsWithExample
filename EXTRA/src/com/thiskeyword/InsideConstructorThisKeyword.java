package com.thiskeyword;
/*Ex:- In side the Constructors this keyword must be first statement in constructors(

1. inside the constructors constructor calling must be the first statement of the contructor other wise the compiler will raise compilation error.
2. The above rule applicable only for constructors.*/

public class InsideConstructorThisKeyword {
	InsideConstructorThisKeyword()
	{
	this(10);
	System.out.println("0 arg");//0 arg(1)
	}
	InsideConstructorThisKeyword(int a)
	{
	this(10,20);
	System.out.println(a);//10(2)
	}
	InsideConstructorThisKeyword(int a,int b)
	{
	System.out.println(a+"--------"+b);// 10 20(1)
	}
	public static void main(String[] args)
	{
	InsideConstructorThisKeyword t=new InsideConstructorThisKeyword();
	}
	///THIS KEYWORD EXPLICITLY RETURN ON FIRST LINE INSIDE THE CONSTRUCTOR
	
/*		InsideConstructorThisKeyword()
		{
		
		System.out.println("0 arg");//0 arg(1)
		this(10);
		}
		InsideConstructorThisKeyword(int a)
		{
		
		System.out.println(a);//10(2)
		this(10,20);
		}
		InsideConstructorThisKeyword(int a,int b)
		{
		System.out.println(a+"--------"+b);// 10 20(1)
		}
		public static void main(String[] args)
		{
		InsideConstructorThisKeyword t=new InsideConstructorThisKeyword();
	}*/
}
