package com.joinm;

public class MyThread extends Thread{
public void run(){
	for(int i=0;i<10;i++){
		System.out.println("seeta thraed");
		try{
			Thread.sleep(1000);
		}
		catch (InterruptedException e){
			// TODO: handle exception
		}
	}
}
}
