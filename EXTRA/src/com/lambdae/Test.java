package com.lambdae;

public class Test{
	public static void main(String[] args) {
//		Demo d=new Demo();
//		d.m1();
//		Interfa i=new Demo();
//		i.m1();
//		Interfa i=() -> System.out.println("m1 of implementation");
//		i.m1();// this format is responsible to call m1() method
//		Interfa i2=(a,b) -> System.out.println("sum:"+(a+b));
//		i2.add(10, 20);
//		i2.add(30, 20);
//		i2.add(10, 40);
		//i2.m3();
		Interfa.m4();
		//Interfa i3=n ->  n*n;//valid
		Interfa i3=(n) -> n*n;//valid
		//Interfa i3=(n) -> {n*n;}//invalid return mendatory
		//Interfa i3=(n) -> {n*n;};//invalid return mendatory
		//Interfa i3=n -> return n*n;//without curly braces we cant write return statement
		//Interfa i3=n -> {return n*n};//invalid
		//Interfa i3=n -> {return n*n};//invalid
		//Interfa i3=n -> {return n*n;}//invalid
		System.out.println("Squre of 4 is" +i3.sq(4));
		System.out.println("Squre of 9 is" +i3.sq(9));
	}
}