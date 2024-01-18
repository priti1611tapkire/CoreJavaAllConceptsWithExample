package com;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		Details d=new Details();
		List l=new ArrayList();
		l=d.setdetails();
		d.getdetails(l);
		System.out.println("ok");
	}

}
