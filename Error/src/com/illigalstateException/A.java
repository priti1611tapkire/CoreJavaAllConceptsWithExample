package com.illigalstateException;

public class A {
public static void main(String[] args) {
	Thread t=new Thread();
	t.start();
	t.start();//we cant start same thread again
}
}
/*Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Unknown Source)
	at com.illigalstateException.A.main(A.java:7)*/