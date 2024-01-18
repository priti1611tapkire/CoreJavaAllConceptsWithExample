package comone;



public class ExampleOfRunnableThread implements Runnable {

	String name;
	Thread t;
	public ExampleOfRunnableThread(String name) {
		this.name=name;
		t=new Thread(this, name);
		System.out.println("How many Threads Work : " +t.activeCount() );
		t.start();
		
	}

	@Override
	 synchronized public void run() {
		try {
			
		t.join(1000);
		for(int i=10;i>0;i--) {
			  // t.sleep(10000);
			System.out.println("Thread Start Count : " +i);
		    //
//			try{
//				//t.wait(0);
//			}
//			catch (IllegalMonitorStateException e) {
//				// TODO: handle exception
//			}
			
		//	t.notify();
		     // i want run this thread after main show output like 10 to 1 etc.. ?
		   // System.out.println("Thread Start Count : " +i);
		}
		
		 }catch (Exception  e) {
			System.out.println("Child Thread Interrupted");
		}
		
	}
	
}
