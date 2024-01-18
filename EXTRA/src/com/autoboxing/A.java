package com.autoboxing;

public class A {
		public static void main(String[] args) {
				int a=10;
				Integer i=new Integer(a);
				System.out.println(i); //AutoBoxing
		}
	
	//		 Integer i=new Integer(50);
	//		//	 int a=i;
	//		//	 System.out.println(a);//UnBoxing
	//		if(i<100){
	//			System.out.println(i);
	//		}
	//	}
	//=====================================================================
	//Example of Autoboxing where widening beats varargs
//	static void m(int i, int i2)
//	{
//		System.out.println("int int");
//	}  
//	static void m(Integer... i){
//		System.out.println("Integer...");
//	}  
//
//	public static void main(String args[]){  
//		short s1=30,s2=40;  
//		m(s1,s2);  
//	}   
	
}
