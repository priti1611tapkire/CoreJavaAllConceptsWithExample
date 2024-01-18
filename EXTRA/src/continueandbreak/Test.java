package continueandbreak;

public class Test{
	public static void	methodone(int...x){
		System.out.println("ok");
	}
	public static void main(String[] args) {
		methodone();
		methodone(10,20);
		methodone(10,20,30);
		methodone(10,25,25,30);
	}
}