package com.oneajas;

import java.util.*;

public class Test {
public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("ABC");
		System.out.println(l.hashCode());
		l.add("AQWERTy");
		System.out.println(l.hashCode());
		l.add(1, "POIUYTREWQ");
		System.out.println(l.hashCode());
		System.out.println(l);
		System.out.println(l.size());
		
//		List<String> l1=new ArrayList<String>();
//		l1.add("ABC");
//		l1.add("ABC1");
//		l1.add("ABC2");
//		l1.add("ABC3");
//		System.out.println(l.hashCode());
//	l.addAll(l1);
//		
		System.out.println(l);
		System.out.println(l.hashCode());
		
		
		//l.remove(4);
		
		System.out.println(l);
		System.out.println(l.hashCode());
		
		l.remove("ABC2");
		
		System.out.println(l);
		System.out.println(l.hashCode());
		
	}
}
