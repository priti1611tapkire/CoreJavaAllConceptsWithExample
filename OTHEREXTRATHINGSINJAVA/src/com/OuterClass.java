package com;

// class OuterClass {
//	int x=10;
//
//	class InnerClass{
//		int y=5;
//	}
//}
//
//public class Main {
//	public static void main(String[] args){
//		OuterClass mo=new OuterClass();
//		OuterClass.InnerClass mi=mo.new InnerClass();
//		System.out.println(mi.y + mo.x);
//	}
//}

//class OuterClass {
//	  int x = 10;
//
//	private  class InnerClass {
//	    int y = 5;
//	  }
//	}
//
//	public class Main {
//	  public static void main(String[] args) {
//	    OuterClass myOuter = new OuterClass();
//	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
//	    System.out.println(myInner.y + myOuter.x);
//	  }
//	}

class OuterClass {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}

	 class Outputb {
	  public static void main(String[] args) {
	    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
	    System.out.println(myInner.y);
	  }
	}
