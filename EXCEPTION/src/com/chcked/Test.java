package com.chcked;

import java.io.PrintWriter;
//FILE NOT FOUND EXCEPTION

public class Test {
	public static void main(String[] args) {
//		PrintWriter p=new PrintWriter("abc.txt");
//		p.println("hello");
		
		//SOLUTION
		try{
			PrintWriter p=new PrintWriter("abc.txt");}
		catch(Exception e){
			System.out.println("hello");
			}

	}
}
//OUTPUT:-Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//Unhandled exception type FileNotFoundException
//
//at com.chcked.Test.main(Test.java:8)
