package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

class Test11 { 
    public static void main(String[] args) 
    { 
  
        // Creating a list of strings 
        List<String> aList = Arrays.asList("Geeks", "for", 
                     "GeeksQuiz", "GeeksforGeeks", "GFG"); 
  
//        Set<String> hSet = new HashSet<String>(); 
//        for (String x : aList) 
//            hSet.add(x); 
//  
//        System.out.println("Created HashSet is"); 
//        for (String x : hSet) 
//            System.out.println(x); 
        
       ListIterator<String> itr= aList.listIterator();
       while(itr.hasNext()){
    	   System.out.println(itr.next());
    	   
    	     // ListIterator<String> itr1=aList.listIterator()
       }
       System.out.println("===============");
       while(itr.hasPrevious()){
	    	  System.out.println(itr.previous());
	      }
  
        // We can created TreeSet same way 
    } 
} 