import java.io.BufferedReader;

public class A {
public static void main(String[] args) {
	try{
		System.out.println(10/0);
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		throw new NullPointerException();
	}
}

}
