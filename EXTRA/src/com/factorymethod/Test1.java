package com.factorymethod;

class Test1 {
	private static Test1 t1=null;
	private static Test1 t2=null;

	private Test1(){

	}
	public static Test1 getTest1(){
		if(t1==null){
			t1=new Test1();
			return t1;
		}
		else if(t2==null){
			t2=new Test1();
			return t2;
		}
		else{
			if (Math.random()<0.5){
				return t1;}
			else{
				return t2;
			}
		}
	}
}
