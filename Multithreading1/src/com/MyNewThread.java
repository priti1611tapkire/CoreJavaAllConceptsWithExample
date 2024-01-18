package com;

public class MyNewThread extends Thread {
	
	public String name;
	Thread t;
	
	public MyNewThread(String name) {
		this.name=name;
		t=new Thread(this,name);
		System.out.println("Mythewd Id : " + t.getId());
		System.out.println(" My thread name is : "+ t.getName());
		t.start();
		System.out.println("Thread Is Active or Not check : " +t.isAlive());
	}
	
	
	@Override
	public void run() {
		try {
		for(int i=1;i<10;i++) {
			System.out.println("Thread Running : " + i);
			System.out.println("How Many thread is active : " +Thread.activeCount());
			System.out.println("Thread Active check : " +t.isAlive());
			Thread.sleep(2500);
		}
		}catch (InterruptedException e) {
			System.out.println("MyThraed Is Interrupted");
		}
		
	}

}

