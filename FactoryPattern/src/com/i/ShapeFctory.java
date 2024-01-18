package com.i;

public class ShapeFctory {

	public Shape getShape(String str){
		
		if(str.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(str.equalsIgnoreCase("sqr"))
			return new Squre();
		else 
			return new Rectangle();
	}
}
