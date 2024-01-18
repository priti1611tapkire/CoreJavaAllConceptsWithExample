package com.overriding;

public class Child extends Parent {
	@Override
	public void marrige(){	//OVERRIDING OF MARRIGE METHOD
		System.out.println("Sejal");
	}
	public String m1(){
		return "MEE";
	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.property();
		p.marrige();
		System.out.println(p.m1());
		
	}
	
}
