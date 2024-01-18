package com.task1;

public class T extends inSufficiantFundException{
public static void main(String[] args) {
	inSufficiantFundException e1=new inSufficiantFundException();
	e1.finSufficiantFund();
	try{
		throw new inSufficiantFundException();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("insufficiant amount");
	}
}
}
