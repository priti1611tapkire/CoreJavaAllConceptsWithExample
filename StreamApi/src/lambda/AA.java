package lambda;

public class AA {
	final int i=10;
	
	AA(int i){}

	public static void main(String[] args) {
		AA a=new AA(100);
		System.out.println(a.i);
		
		 int i=500;
		AA a1=new AA(i);
		System.out.println(a1.i);
	}
	
}