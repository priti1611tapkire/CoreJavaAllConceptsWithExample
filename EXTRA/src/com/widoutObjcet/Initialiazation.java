package com.widoutObjcet;

public class Initialiazation {
	private static String m1(String msg){
		System.out.println(msg);
		return msg;
	}
	public Initialiazation() {
		// TODO Auto-generated constructor stub
		m1("1");
	}
	{
		m1("2");
	}
	
	String s=m1("6");
	public static void main(String[] args) {
		Object o=new Initialiazation();
	}
}
