package lambda;

public class Finals {
	final int i;
	public Finals(int i) {
		this.i=i;	
	}
	public static void main(String[] args) {
		Finals f=new Finals(10);
		System.out.println(f.i);
	}

}
