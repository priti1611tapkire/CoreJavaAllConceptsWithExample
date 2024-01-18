package com.mm;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
		
		for(int i=1; i<10;i++){
			try {
				Thread.sleep(3000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		for(int j=1; j<5;j++){
			System.out.println(j);
			
		}
		m1.notify();
	}

	
}
