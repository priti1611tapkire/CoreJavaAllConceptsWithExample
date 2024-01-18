package com.task1;

import java.util.Scanner;

public class ExceptionHandling {

	
	 public static void main(String[] args)
	    {
	          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
	 
	          System.out.println("Enter Your Age");
	 
	          int age = sc.nextInt();         //Taking input from user
	          
	          if(age<18){
	        	  System.out.println("your are not eligible for voting");
	          }
	          else if(age<21){
	        	  System.out.println("You are not eligible for marrige");
	          }
	          else if(age<25){
	        	  System.out.println("you are not eligible for navy");
	          }
	          else{
	        	  System.out.println("congratulation you are eligible for everything");
	          }
	          
	          
	          
	          
	          
	 
//	          try
//	          {
//	              if(age < 18)
//	              {
//	                  throw new Exception();    //throws an Exception if age is negative
//	              }
//	          }
//	          catch(Exception ex)
//	          {
//	              System.out.println(ex);     //Prints exception description
//	          }
//	          finally {
//				System.out.println("tera satyanash honga");
//			}
	          
	    }
}
