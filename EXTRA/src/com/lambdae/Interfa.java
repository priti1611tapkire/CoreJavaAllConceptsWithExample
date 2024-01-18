 package com.lambdae;
@FunctionalInterface
public interface Interfa {
//public void m1();
	//public void add(int a, int b);
	public int sq(int n);
	//public void sub(int a, int b);
	default void m3(){
		System.out.println("m3 default implementation");
	}
	static void m4(){
		System.out.println("m4 static implembtation");
	}
}



