package com.factorymethod;

public class Test {
	private static Test t=null;
	private Test(){}
	public static Test geTest(){

		if(t==null){
			t=new Test();
		}
		return t;
	}
	
}
