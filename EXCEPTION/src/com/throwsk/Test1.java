package com.throwsk;
//one way to handle exception
public class Test1 {
	public static void main(String[] args) {
		for(int i=1; i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ha ha ha");
			}
			System.out.println("i slept very happily");
		}
		}
}
