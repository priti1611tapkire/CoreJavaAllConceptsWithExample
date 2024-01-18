


package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Methods {
	public static void main(String[] args) {
		//filter(Predict)

		List<String> list=new ArrayList<String>();
		list.add("Aman");
		list.add("Abhi");
		list.add("Bena"); 
		list.add("Bela");
		list.add("Durgesh"); 

		List<String> nlist=list.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(nlist);
		
		List<String> nlist1=list.stream().filter(e->e.startsWith("B")).collect(Collectors.toList());
		System.out.println(nlist1);
		
		List<String> nlist2=list.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
		System.out.println(nlist2);
		
		List<String> nlist3=list.stream().filter(e->e.endsWith("a")).collect(Collectors.toList());
		System.out.println(nlist3);


		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30); 
		list1.add(15);
		list1.add(16); 

		List<Integer> nlList=list1.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(nlList);
		
		List<Integer> nlList1=list1.stream().filter(e-> e>10).collect(Collectors.toList());
		System.out.println(nlList1);
		
		
		List<Integer> nlList3=list1.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(nlList3);
		
		List<Integer> nlList4=list1.stream().map(e->e/e).collect(Collectors.toList());
		System.out.println(nlList4);
		
		List<Integer> nlList5=list1.stream().map(e->e+e).collect(Collectors.toList());
		System.out.println(nlList5);
		
		List<Integer> nlList6=list1.stream().map(e->e-e).collect(Collectors.toList());
		System.out.println(nlList6);
		
//		List<Integer> nlList6=list1.stream().map(e->e-e).collect(Collectors.toList());
//		System.out.println(nlList6);
		
		list.stream().forEach(e->{
			System.out.println(e);
		});
		
		nlist1.stream().forEach(System.out::println);
		System.out.println("===========");
		list.stream().forEach(System.out::println);
		
	
	
		
		
		list1.stream().sorted().forEach(System.out::println);
		
		list.stream().sorted().forEach(System.out::println);
		
//		System.out.println("===========");
//		
//		Integer integer=list1.stream().min((x,y) ->x.compareTo(y)).get();
//		System.out.println("min"+integer);
//		
//		Integer integer1=list1.stream().max((x,y)->x.compareTo(y)).get();
//		System.out.println("max"+integer1);
//		
//		
//		
//		System.out.println("===========");
//		List<String> nlist5=list.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
//		nlist5.stream().forEach(System.out::println);4
		
		System.out.println("===========");
		System.out.println("===========");
		System.out.println("===========");
		
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "priti");
		m.put(2, "Naina");
		m.put(3, "prits");
		m.put(4, "Neena");
		m.put(5, "priya");
		m.put(2, "Maithili");
		System.out.println(m);
		
//		m.forEach((k.v)->{
//			System.out.println(k,v);
//		});
//		
		
		
		
		
		
				
	}
}
