package Explanation;

public class B extends A{
	public B(){
		this("xyz");//same class chya dusrya constructor jyala yacha type match milat asel tithe jato
		System.out.println("Constrctor B");
	}

	public B(int i){
		super();///Parents class chya constructor la call krnyasati use krtat
		System.out.println("Constrctor int B");
	}
	
	public B(String s){
		this(4);
		System.out.println("Constrctor string B");
	}


}

