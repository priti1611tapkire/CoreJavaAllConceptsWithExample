package com.illigalstateException;

import java.util.ArrayList;
import java.util.Iterator;

public class B {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		Iterator< String> itr=list.iterator();
		while(itr.hasNext()){
			Object s=itr.next();
			System.out.println(s);
			//itr.remove();
		}
		System.out.println(list);
	}	
}
