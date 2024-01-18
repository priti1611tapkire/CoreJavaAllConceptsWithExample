package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {
	public static void main(String[] args) {
		
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30); 
	list.add(15);
	list.add(16); 
	list.add(30); 
	list.add(15);
	list.add(16); 
	
	Set<String> s=new HashSet<>();
	
//	Set<Integer> duplicte=Arrays.asList(list).stream().filter(e-> !s.add(e);).collect(Collectors.toSet()));
//	System.out.println(duplicte);

	
	}
}
