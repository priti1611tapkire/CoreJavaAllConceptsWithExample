package com.methods;
//return type is compulsory for methods 
//here we cant writemethod inside methods
public class CheckReturnType {
//	void m1()
//	{
//		
//	System.out.println("hi m1-method");
//	
//	}
//	// m2() ///> give us error witout retuen type
//	void m2()
//	{
//	System.out.println("hi m2-method");
//	}
//	public static void main(String[] args)
//	{
//		CheckReturnType t=new CheckReturnType();
//	t.m1();
//	t.m2();
//	}
	
	
	void deposit(int accno)
	{
	System.out.println("money is deposited into "+accno);
	}
	void withdraw(float amount)
	{
	System.out.println("money withdraw is over amount "+amount);
	}
	public static void main(String[] args)
	{
		CheckReturnType t=new CheckReturnType();
	t.deposit(111);
	t.withdraw(10000);
	}
}
