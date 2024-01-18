package Explanantions;

public class B extends A{
	public B(){
		System.out.println("no arg constructor of b");
	}
	public B(String x){
		super(10);
		System.out.println("String arg of B");
	}
	public static void main(String[] args) {
		//B b=new B();
		B b1=new B("cjc");
	}
}
