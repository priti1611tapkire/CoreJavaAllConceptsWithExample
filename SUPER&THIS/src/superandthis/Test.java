package superandthis;

public class Test {

	Test(double d){
		System.out.println("double arg"+d);//1, 4
	}

	Test(long l){
		this(15.5);
		System.out.println("long arg"+l);
	}
	Test(int i){
		this(10.6);//3
		System.out.println("int arg"+i);//5
	}
	Test(float f){
		this(100.5);
		System.out.println("float arg"+f);
	}
	Test(){
		this(10);
		System.out.println("no arg");
	}

	public static void main(String[] args) {
		//	System.out.println(super.hashCode());  Cannot use super in a static context

		Test t=new Test(10.55);//he Test(double d)
		Test t1=new Test();// 2  Test(int i)
		Test t2=new Test(111.50);//6
		Test t3=new Test(1111111.5);

	}
}


