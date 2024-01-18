package com.one1;

public class Test {
	public static void main(String[] args) {
		A a=new A();
		a.m1();//m1 Method of A 
		a.m2();//m2 Method of A
		System.out.println(a.a);//10
		System.out.println(a.b);//20
		System.out.println("========1========");
		
		B b=new B();
		b.m1();//m1 Method of B
		b.m2();//m2 Method of B
		b.m4();//m4 Method of B
		System.out.println(b.a);//10
		System.out.println(b.b);//10
		System.out.println(b.c);//20
		System.out.println("========2========");
		
		C c=new C();
		c.m1();//m1 Method of A
		c.m2();//m2 Method of C
		c.m3();//m3 Method of C
		c.m5();//m5 Method of C
		System.out.println(c.a);//40
		System.out.println(c.b);//20
		System.out.println(c.c);//30
		System.out.println("========3========");
		
		D d=new D();
		d.m1();//m1 Method of D
		d.m2();//m1 Method of B
		d.m3();//m3 Method of D
		d.m4();//m4 Method of D
		System.out.println(d.a);//10
		System.out.println(d.b);//10
		System.out.println(d.c);//20
		System.out.println(d.d);//40
		System.out.println(d.e);//5
		System.out.println("=======4=========");
		
		E e=new E();
		e.m1();//m1 Method of A
		e.m2();//m2 Method of C
		e.m3();//m3 Method of E
		e.m5();//m5 Method of E
		e.m6();//m6 Method of E
		System.out.println(e.a);//40
		System.out.println(e.b);//30
		System.out.println(e.c);//30
		System.out.println(e.e);//30
		System.out.println("========5========");
		
		F f=new F();
		f.m1();//m1 Method of A
		f.m2();//m2 Method of C
		f.m3();//m3 Method of F
		f.m5();//m5 Method of F
		f.m6();//m6 Method of F
		System.out.println(f.a);//20
		System.out.println(f.b);//30
		System.out.println(f.c);//30
		System.out.println("========6========");
		
		G g=new G();
		g.m1();//m1 Method of G
		g.m2();//m2 Method of B
		g.m3();//m3 Method of G
		g.m4();//m4 Method of G
		System.out.println(g.a);//10
		System.out.println(g.b);//10
		System.out.println(g.c);//20
		System.out.println(g.d);//20
		System.out.println("========7========");
		
		H h=new H();
		h.m1();//m1 Method of H
		h.m2();//m2 Method of B
		h.m3();//m3 Method of H
		h.m4();//m4 Method of H
		System.out.println(h.a);//50
		System.out.println(h.b);//10
		System.out.println(h.c);//10
		System.out.println(h.d);//40
		System.out.println(h.e);//5
		System.out.println("========8========");
		
		A a1=new B();
		a1.m1();//m1 Method of B
		a1.m2();//m2 Method of B
		System.out.println(a1.a);//10
		System.out.println(a1.b);//20
		System.out.println("========9========");
		
		A a2=new C();
		a2.m1();//m1 Method of A
		a2.m2();//m2 Method of C
		System.out.println(a2.a);//10
		System.out.println(a2.b);//20
		System.out.println("========10========");
		
		A a3=new D();
		a3.m1();//m1 Method of D
		a3.m2();//m2 Method of B
		System.out.println(a3.a);//10
		System.out.println(a3.b);//20
		System.out.println("========11========");
		
		A a4=new E();
		a4.m1();//m1 Method of A
		a4.m2();//m2 Method of C
		System.out.println(a4.a);//10
		System.out.println(a4.b);//20
		System.out.println("========12========");
		
		A a5=new F();
		a5.m1();//m2 Method of A
		a5.m2();//m1 Method of C
		System.out.println(a4.a);//10
		System.out.println(a4.b);//20
		System.out.println("========13========");
		
		A a6=new G();
		a6.m1();//m1 Method of G
		a6.m2();//m2 Method of B
		System.out.println(a6.a);//10
		System.out.println(a6.b);//20
		System.out.println("=======14=========");
		
		A a7=new H();
		a7.m1();//m1 Method of H
		a7.m2();//m1 Method of B
		System.out.println(a7.a);//10
		System.out.println(a7.b);//20
		System.out.println("========15========");
		
		B b1=new D();
		b1.m1();//m1 Method of D
		b1.m2();//m2 Method of B
		b1.m4();//m4 Method of D
		System.out.println(b1.a);//10
		System.out.println(b1.b);//10
		System.out.println(b1.c);//20
		System.out.println("========16========");
		
		B b2=new G();
		b2.m1();//m1 Method of G
		b2.m2();//m1 Method of B
		b2.m4();//m4 Method of G
		System.out.println(b2.a);//10
		System.out.println(b2.b);//10
		System.out.println(b2.c);//20
		System.out.println("========17========");
		
		C c1=new E();
		c1.m1();//m1 Method of A
		c1.m2();//m2 Method of C
		c1.m3();//m3 Method of E
		c1.m5();//m5 Method of E
		System.out.println(c1.a);//40
		System.out.println(c1.b);//20
		System.out.println(c1.c);//30
		System.out.println("========18========");
		
		C c2=new F();
		c2.m1();//m1 Method of A
		c2.m2();//m2 Method of C
		c2.m3();//m3 Method of F
		c2.m5();//m5 Method of F
		System.out.println(c2.a);//40
		System.out.println(c2.b);//20
		System.out.println(c2.c);//30
		System.out.println("========19========");
		
		D d1=new H();
		d1.m1();//m1 Method of H
		d1.m2();//m1 Method of B
		d1.m3();//m3 Method of H
		d1.m4();//m4 Method of H
		System.out.println(d1.a);//10
		System.out.println(d1.b);//10
		System.out.println(d1.c);//20
		System.out.println(d1.d);//40
		System.out.println(d1.e);//5
		
	}
}
