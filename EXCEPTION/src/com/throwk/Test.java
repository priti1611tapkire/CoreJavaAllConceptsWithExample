package com.throwk;

public class Test {
	public static void main(String[] args){
	//	System.out.println(10/0);
		throw new ArithmeticException("/by zero");
	}
}
//throw===to handover our created exception object to jvm manually
//new ArithmeticException("/by zero")==creating ArithmeticException object explicitly