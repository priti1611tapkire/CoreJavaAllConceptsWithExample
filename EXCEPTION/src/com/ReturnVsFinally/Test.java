package com.ReturnVsFinally;

public class Test {
public static void main(String[] args) {
	try{
		System.out.println( "try block executed");
		  
	System.exit(0);
	}
	catch(Exception e){
		System.out.println("catch block");
	}
	finally{
		System.out.println("finally block");
	}
}
}
/*can finally block won't executed ?
 * Yes
 * in which situation situation?
 * When we declraed (System.exit(0)) 
 * inside try block or in catch block then n only 
 * finally block wont be executed
 
 * */
