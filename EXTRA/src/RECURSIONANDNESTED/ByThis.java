package RECURSIONANDNESTED;

public class ByThis {
	ByThis(int i){
		this();
	}
	ByThis(){
		this(10);
	}
	public static void main(String[] args) {
		System.out.println("hello");
	}
}
//OUTPUT:-Recursive constructor invocation ByThis(int)