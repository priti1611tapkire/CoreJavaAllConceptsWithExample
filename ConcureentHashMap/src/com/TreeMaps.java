package com;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(10000, "Priti");
		map.put(15000, "Manu");
		map.put(5000, "bish");
		map.put(25000, "pranajl");
		map.put(18000, "ankit");
		map.put(5000, "laila");
		System.out.println(map);
		map.forEach((k,v)-> System.out.println("key:"+k+ " , Value:" +v));
		
		System.out.println(map.headMap(18000));
		System.out.println((map.tailMap(15000)));
		
		System.out.println(map.lastKey());
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.firstKey());
		
		

	}
}
