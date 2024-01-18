package lambda;

public class B extends A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 abstract");
	}
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
	
		B b=new B();
		b.m1();
		b.m2();
		A.m2();
	}
	
	

}
