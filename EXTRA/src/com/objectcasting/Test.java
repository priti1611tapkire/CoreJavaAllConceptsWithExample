package com.objectcasting;

public class Test {
	public static void main(String[] args) {
//		//OBJECT CASTING
//		Object o=new String("priti");
//		StringBuffer sb=(StringBuffer) o;
//
//		String s=new String("durga");
//		Object o1=(Object)s;
//		//===========================
//		//TYPECASTING
//		
//		Integer i=new Integer(10);
//		Number n=(Number)i;
//		Object o2=(Object)n;//by combining all 3
//		Object o3=new Integer(10);
		
		C c=new C();
		c.m1();
		System.out.println("=====1");
		c.m2();
		System.out.println("=====2");
		c.m3();
		System.out.println("=====3");
		((A)c).m1();
		System.out.println("=====4");
		((A)(B)c).m1();
		System.out.println("=====5");
		((B)c).m1();
		System.out.println("=====6");
		((B)c).m2();
		System.out.println("=====7");
		((C)c).m1();
		System.out.println("=====8");
		((C)c).m2();
		System.out.println("=====9");
		((C)c).m3();
//		
//		
//		//((A)c).x;
//	(A((B)c).x);
//		
		B b=new C();
		
		
	}
}
 