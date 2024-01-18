package com.thiskeyword;
import java.util.*;

public class ThisWidScanner {
//	String sname;
//	int sno;
//	ThisWidScanner()
//	{
//	Scanner s=new Scanner(System.in);
//	System.out.println("enter sname:");
//	String sname=s.next();
//	this.sname=sname;
//	System.out.println("enter no");
//	int sno=s.nextInt();
//	this.sno=sno;
//	}
//	void display()
//	{
//	System.out.println("**student details******");
//	System.out.println("student name:---"+sname);
//	System.out.println("student no:---"+sno);
//	}
//	public static void main(String[] args)
//	{
//		ThisWidScanner s=new ThisWidScanner();
//	s.display();
//	}
	String sname;
	int sno;
	ThisWidScanner()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter sname:");
	sname=s.next();
	System.out.println("enter sno");
	sno=s.nextInt();
	}
	void display()
	{
	System.out.println("**student deatils**");
	System.out.println("student sname"+sname);
	System.out.println("student sno"+sno);
	}
	public static void main(String[] args)
	{
		ThisWidScanner s=new ThisWidScanner();
		s.display();
	}
}
