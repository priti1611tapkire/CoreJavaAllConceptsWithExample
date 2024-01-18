package com;

import java.util.ArrayList;
import java.util.List;

public class B {
	public static void main(String[] args) {
		List<Number> list1=new ArrayList();
		list1.add(73.3f);
		list1.add(256.39d);
		list1.add(11);
		list1.add(77L);
		list1.add(77L);
		list1.add(79.10f);
		list1.add(87D);
		list1.add(58l);
		
		for(Number num:list1){
			System.out.println(num);
		}
	}
	
	

}
