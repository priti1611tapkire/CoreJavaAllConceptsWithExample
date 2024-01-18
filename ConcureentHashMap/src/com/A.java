package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class A {
	public static void main(String[] args) {
		Map<String, String> m=new Hashtable<>();
		m.put("1", "Priti");
		m.put("2", "Kirti");
		m.put("3", "Preesha");
		m.put("4", "Preet");
		m.put("1", "Deepa");
		System.out.println(m);


//		Map<String, Integer> prices = new HashMap<>();
//		prices.put("Apple", 50);
//		prices.put("Orange", 20);
//		prices.put("Banana", 10);
//		prices.put("Grapes", 40);
//		prices.put("Papaya", 50);
//System.out.println("======================");		prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));

System.out.println("======================");		m.forEach((k,v)->System.out.println("NO: " + k + ", Namw: " + v));
		
System.out.println("======================");		m.forEach((k,v)->System.out.println(k+ " "+v));

		//		Set<Map<String, String>> m1=new HashSet<>();
		//		
		//		Iterator itr=m1.
//System.out.println("======================");	
//		for(Entry<String, Integer> pri:prices.entrySet()){
//
//			System.out.println("Frurts:" + pri.getKey() + " , Prices:" + pri.getValue());
//		}
		System.out.println("======================");	
		for(Entry<String, String> m1:m.entrySet()){
			System.out.println("No: "+m1.getKey()+ " , Name:" +m1.getValue());
		}
		
		System.out.println("======================");	
		
		Map<String, String> prices =Collections.synchronizedMap(m);
		System.out.println(prices);
		System.out.println("======================");	
		System.out.println("======================");	
		System.out.println("======================");	
		prices.get("1");
		System.out.println("======================");	
		ConcurrentHashMap<String, Integer> cm=new ConcurrentHashMap<>();
		cm.put("Apple", 50);
		cm.put("Orange", 20);
		cm.put("Banana", 10);
		cm.put("Grapes", 40);
		cm.put("Papaya", 50);
		System.out.println(cm);
		System.out.println(cm.get("Papaya"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
