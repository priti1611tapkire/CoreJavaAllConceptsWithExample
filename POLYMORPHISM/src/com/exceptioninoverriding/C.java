package com.exceptioninoverriding;

import java.io.IOException;

public class C extends P{

	//public void m1() throws Exception {
	//	CHECKED EXCEPTION
	//		override method throws same exception or thier child exception
	//	}
	//	public void m1() throws IOException {
	//	//CHECKED EXCEPTION	
	//	}
	public void m1() throws ArrayIndexOutOfBoundsException {

	}
} 
