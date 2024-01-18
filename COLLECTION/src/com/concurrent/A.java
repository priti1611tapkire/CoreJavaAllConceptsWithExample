package com.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class A {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
		m.put(101, "A");
		m.put(102, "B");
		m.putIfAbsent(103, "C");
		m.putIfAbsent(101, "D");
		m.remove(101, "D");
		m.replace(102, "M", "E");
		System.out.println(m);
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()){
			Integer ii=i.next();
			m.put(105,"J");
			System.out.println(ii);
			String val=m.get(ii);
			System.out.println(val);
		}
		
		
	}

}