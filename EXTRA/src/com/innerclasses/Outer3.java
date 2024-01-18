package com.innerclasses;

public class Outer3 {
	int x=10;
	class Inner{
		int x=2500;
		public void m1(){
			int x=20;	
			System.out.println(x);//20
			System.out.println(this.x);//2500
			System.out.println(Outer3.this.x);//10
		}
	}
	public static void main(String[] args) {
		new Outer3().new Inner().m1();
		
	}
}
