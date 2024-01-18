package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		//Stram API -Collectionprocess
		//collection/group of object
		//array
		
		
		//empty stream creation
//		Stream<Object> emptyStream= Stream.empty();
//		emptyStream.forEach(e->{
//			System.out.println(e);
//		});
		System.out.println("===============");
		String name[]={"PRITI", "ABC","PQR"};
			
		Stream<String> stram1=Stream.of(name);
		stram1.forEach(e->{
			System.out.println(e);
		});
//		
//		
//		
//		Object name1[]={"PRITI", "ABC","PQR"};
//		Stream<Object> streambuildetr=Stream.builder().build();
//		
//		  
		
		//MAIN LIST,SET
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30); 
		list.add(15);
		list.add(16); 
	
		Stream<Integer> stram=list.stream();
		stram.forEach(e->{
			System.out.println(e);
		});
		
	
	}

}
