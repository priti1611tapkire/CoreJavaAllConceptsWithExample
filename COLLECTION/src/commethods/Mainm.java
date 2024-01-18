package commethods;

public class Mainm {
	public static void main(String[] args) {
		//		StringFunction exclaim=(s) -> s +"!";
		//		StringFunction ask=(s) -> s + "?";
		//		printFormatted("Hello", exclaim);
		//		printFormatted("Hello", ask);
		//	}
		//
		//	private static void printFormatted(String str, StringFunction format) {
		//		// TODO Auto-generated method stub
		//		String result=format.run(str);
		//		System.out.println(result);
		//	}
		//		StringFunction exclaim=(s) -> s +"!";
		//		StringFunction ask=(s) -> s + "?";
		//		printFormatted("Hey", exclaim);
		//		printFormatted("Are you Okay", ask);
		//	}
		//
		//	private static void printFormatted(String str, StringFunction format) {
		//		// TODO Auto-generated method stub
		//		String result=format.run(str);
		//		System.out.println(result);
		//	}
//		StringFunction exclaim=(s) -> s +"!";
//		StringFunction ask=(s) -> s + "?";
//		printFormatted("Hey", exclaim);
//		printFormatted("Are you Okay", ask);
//	}
//
//	private static void printFormatted(String str, StringFunction format) {
//		// TODO Auto-generated method stub
//		String result=format.run(str);
//		System.out.println(result);
//	}
		
		int width=10;  
		  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
	}

}
