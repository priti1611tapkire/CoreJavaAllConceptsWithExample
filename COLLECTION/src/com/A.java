package com;

import java.util.ArrayList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		list.add(34);
		list.add("abc");
		list.add('M');
		list.add("xyx");
		list.add(45);
		list.add('A');
		
		for(Object list1:list){
			System.out.println(list1);
		}
	}

}
