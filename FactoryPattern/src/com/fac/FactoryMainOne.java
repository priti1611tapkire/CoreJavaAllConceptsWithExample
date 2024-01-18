package com.fac;

import com.i.Shape;
import com.i.ShapeFctory;

public class FactoryMainOne {
	public static void main(String[] args) {
		ShapeFctory sf=new ShapeFctory();
		Shape s=sf.getShape("sqr");
		s.draw();
	}
}
