package com.onm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(1);
		l.add(15);
		l.add(25);
		
//		Iterator<Integer> itr=l.iterator();
//		
//		while(itr.hasNext()){
//			Integer i=itr.next();
//			System.out.println(i);
//			itr.remove();
//			//l.remove(1);
////			if(i%2==0){
////				System.out.println(i);
////				System.out.println("=====");
////			}
////			else{
////				itr.remove();
////				System.out.println("++");
////			}
//		}

//		System.out.println("====++++===");
//		
//		
		ListIterator<Integer> ll=l.listIterator();
//		
		while(ll.hasNext()){
			Integer i1=ll.next();
			System.out.println(i1);
		}
		System.out.println("==========");
		
		while(ll.hasPrevious()){
			Integer i1=ll.previous();
			System.out.println(i1);
		}
	}
}