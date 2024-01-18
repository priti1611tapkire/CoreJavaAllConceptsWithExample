package com;

public class SimpleNewThread {

	public static void main(String[] args) {
		
		Thread thread=new Thread("My Thread") {
			
			@Override
			public void run() {
				for(int j=10;j>0;j--) {
					System.out.println("Child Thread : " + j);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		thread.currentThread().setName("AJAS");
		System.out.println(thread.getName());//My Thread
		thread.setName("My newName");//My new Name
		System.out.println(thread.getName());
		try {
			Thread.sleep(0);
		}
		catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
     	System.out.println("Main Thread CDone");
		
	}

}
