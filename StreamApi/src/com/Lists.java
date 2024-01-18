package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists {
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30); 
		list.add(15);
		list.add(16); 
		//
		//	List<Integer> listEven=new ArrayList<>();
		//	List<Integer> listOdd=new ArrayList<>();
		//	
		//	for(Integer l:list){
		//		//System.out.println(l);
		//		if(l%2!=0){
		//			//listEven.add(l);
		//			listOdd.add(l);
		//		}
		//	}
		//	System.out.println(list);
		//	System.out.println(listEven);
		//	System.out.println(listOdd);

		//using STREAMAPI

		Stream<Integer> stream=list.stream();
		List<Integer> nlist= stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(nlist);
		
		List<Integer> nlist1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(nlist1 );
		
		
		List<Integer> nlist2=list.stream().filter(i->i<50).collect(Collectors.toList());
		System.out.println(nlist2);
		
		

	}
}
