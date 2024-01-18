package com.abtractcls;

public class Test 
{ 
    // calculating sum using strictfp modifier 
    public strictfp double sum() 
    { 
        double num1 = 10.0; 
  
        double num2 = 3; 
  
        return (num1/num2); 
  
    } 
  
    public static strictfp void main(String[] args) 
    { 
        Test t = new Test(); 
  
        System.out.println(t.sum()); 
    } 
} 