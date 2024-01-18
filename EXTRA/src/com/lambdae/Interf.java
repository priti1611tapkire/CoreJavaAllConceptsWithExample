package com.lambdae;
@FunctionalInterface
//only 1 abstract method mandatory for making this interface functional interface 
//in functinal interface n no of static and default method
public interface Interf {
//public abstract void m1();
	public void m1();
////public abstract void m6();//invalid
//default void m2(){
//	
//}
//static void m3(){
//	
//}
	
}
//==============================(functional interface vs inheritance)
         //case:1 
//@FunctionalInterface
//interface B {
//	   act as a indivisual interface n here 1 abstract method mandatory for making this interface functional interface   
//}
        //case:2
//@FunctionalInterface
//interface B extends Interf  {
//	 public void m2 ();//this is not allow in functional interface
//}

	//case-3
interface B extends Interf  {
	 public void m2 ();//this is not functional interface
}
