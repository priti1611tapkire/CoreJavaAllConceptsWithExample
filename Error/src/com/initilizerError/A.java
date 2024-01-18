package com.initilizerError;

public class A {
static int a=10/0;

public static void main(String[] args) {
	System.out.println(a);
}
}
/*Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
at com.initilizerError.A.<clinit>(A.java:4)
*/