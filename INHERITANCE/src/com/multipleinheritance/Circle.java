package com.multipleinheritance;

public class Circle {
	Operation op;
	double pi=3.14;

	double area(int radius){
		op=new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;

	}
	public static void main(String[] args) {
		Circle c=new Circle();
		Double result=c.area(5);
		System.out.println(result);
	}
}
