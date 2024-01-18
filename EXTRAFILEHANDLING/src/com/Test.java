package com;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		//		File f=new File("D:\\abc\\pqr.txt");
		//		
//				if(f.mkdir()){
//					System.out.println(f);
//				}
		//		FileWriter fwriter=new FileWriter(f);
		//		fwriter.write("HI THIS IS TRAP BY ANONYMOUS HACKER: -WE ARE LEGENDS...!");
		//		
		//		fwriter.close();
		//		if(f.exists()){
		//		
		//			System.out.println("FILE NAME: "+f.getName());
		//			System.out.println("FILE PATH: "+f.getAbsolutePath());
		//			System.out.println("FILE PATH: "+f.getCanonicalPath());
		//			System.out.println(f.canRead());

//	}
		
		//============================================================================
		System.out.println("PRINTWRITER");
		//PrintWriter p=null;
		PrintWriter p=new PrintWriter(new File("D:\\A\\prit.txt"));
		
		
		p.write("HAVE A NICE DAY");
		p.close();
		p.flush();
}

}
