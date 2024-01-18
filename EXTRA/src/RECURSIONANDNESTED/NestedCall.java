package RECURSIONANDNESTED;

public class NestedCall {

	public static void m1(){
		m2();
		System.out.println("m1");
	}
	public static void m2(){
		m1();
		System.out.println("m2");
	}

	public static void main(String[] args) {
		NestedCall n=new NestedCall();
		n.m1();
		n.m2();
	}
}
