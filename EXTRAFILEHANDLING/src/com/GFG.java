package com;

//Java program to demonstrate 
//the use of File.mkdirs() method 

import java.io.*; 

public class GFG { 

	public static void main(String args[]) throws FileNotFoundException 
	{ 
		// create an abstract pathname (File object) 
//		File f = new File("D:\\cjck"); 
//
//		// check if the directory can be created 
//		// using the abstract path name 
//		if (f.mkdir()) { 
//
//			// display that the directory is created 
//			// as the function returned true 
//			System.out.println("Directory is created"); 
//		} 
//		else { 
//			// display that the directory cannot be created 
//		}
		File f1=new File("D:\\mee\\abc.txt");
		//f1.mkdir();
		//PrintWriter p=new PrintWriter(f1);
		File f2=new File("D:\\mee\\pqr.txt");
		f1.renameTo(f2);
		//p.write("Hey its me Prits");
		//p.close();
		
		//f1.delete();
		
		
	}
}
