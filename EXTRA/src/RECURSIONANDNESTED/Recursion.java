package RECURSIONANDNESTED;

public class Recursion {

	public void m1(){
		System.out.println("Recursion");
		m1();
	}
	public static void main(String[] args) {
		Recursion r=new Recursion();
		r.m1();
	}
}
