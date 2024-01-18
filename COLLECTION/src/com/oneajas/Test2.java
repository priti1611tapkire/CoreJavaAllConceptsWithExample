package com.oneajas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {
	public static void main(String[] args) {
	//	List<String> list=new CopyOnWriteArrayList<>();//fail-safe
		List<String> list=new ArrayList<String>();//fail-fast
		list.add("ABC");
		list.add("PQR");
		list.add("MNP");
		list.add("PQR");
		list.add("XYZ");
		list.add("MNP");
		list.add("ABC");
//		
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//			list.add("EFG");
//		}	
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
			//list.add("DEF");
		}
		
		
		
		
	}
}
