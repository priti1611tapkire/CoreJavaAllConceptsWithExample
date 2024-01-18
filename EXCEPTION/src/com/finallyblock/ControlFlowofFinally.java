package com.finallyblock;

public class ControlFlowofFinally {

	public static void main(String[] args) {
		try{
			System.out.println("in try");
			System.out.println(10/0);
			System.out.println("going outside");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("in catch");
		}
	
	finally{
		System.out.println(10/0);
	}
		System.out.println("out side  of try catch");
	}
}
