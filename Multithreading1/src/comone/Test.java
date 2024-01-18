package comone;


public class Test {
	
	public static void main(String[] args) {
		
		ExampleOfRunnableThread ex=new ExampleOfRunnableThread("Child Thrad");
		
		try {
			for(int i=1;i<=25;i++) {
			//	Thread.sleep(5000);
				System.out.println("Main Thread On : " + i );	
				
			}
		//ExampleOfRunnableThread ex1=new ExampleOfRunnableThread("Child Thread");	
		}catch (Exception e) {
			System.out.println("Main thread interruption");
		}
	}

}

