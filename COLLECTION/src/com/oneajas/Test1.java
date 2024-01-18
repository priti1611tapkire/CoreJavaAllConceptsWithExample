package com.oneajas;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {


		List<String> l=new CopyOnWriteArrayList<String>();


		l.add("A");l.add("B");l.add("C");l.add("D");l.add("E");l.add("F");

		//	for(int i=0; i<l.size();i++) {
		//		System.out.println(l.get(i));	
		//	}
		Iterator<String> itr=l.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
			l.add("P");
		}
		System.out.println(l);//Fail-safe

		List<String> l1=new CopyOnWriteArrayList<String>();

		l1.add("AB");l1.add("AB");l1.add("CD");l1.add("DE");l1.add("EF");l1.add("FG");

		Collection<String> l3= Collections.unmodifiableCollection(l1);

		Set<String> s=new HashSet<String>(l1);
		System.out.println("Converted list into set:" +s);

		List<String> l2=Collections.synchronizedList(l1);

		System.out.println(l2);
		synchronized (l2) {
			Iterator<String> itr1=l2.iterator();
			//synchronized (itr1) {
			while(itr1.hasNext()) {
				System.out.println(itr1.next());

			}
		}
		//}
	}
}





