package comm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//import java.util.concurrent.ConcurrentHashMap;

public class HashSeth {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)  {
		Set s=new HashSet();
		s.add(1);
		s.add(2);
		s.add(6);
		s.toArray();
		Set s1=new HashSet();
		s1.add(4);
		s1.add(5);
		s1.add(6);
		s1.add(7);

		Set s2=new HashSet();
		s2.add(8);
		s2.add(9);
		s2.add(10);
		s2.add(11);

		System.out.println(s);
		//System.out.println(s1.equals(s));
		//System.out.println(s1.hashCode()==s.hashCode());
		System.out.println(s.hashCode()==s.hashCode());
		System.out.println(s.equals(s));

		List l=new ArrayList<>(s);
		@SuppressWarnings("unused")
		List l1=new ArrayList<>(s1);
		@SuppressWarnings("unused")
		List l2=new ArrayList<>(s2);

		@SuppressWarnings("unused")
		List l3=new LinkedList<>(s2);

		Collections.sort(l);
		System.out.println("AfterSorting"+l);
		Collections.shuffle(l);
		System.out.println("afterShuffle"+l);

		Collections.swap(l, 1, 2);
		System.out.println();

		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Integer i=(Integer) itr.next();
			System.out.println(i);
			//			try{
			//				s.remove(6);
			//			}
			//			catch (Exception e) {
			//				// TODO: handle exception
			//				e.printStackTrace();
			//			}
			//		
		}
		List l5=new LinkedList<>();
		l5.add(10);
		l5.add(20);
		l5.add(30);
		l5.add(40);
		l5.add(50);
		l5.add(10);
		l5.add(90);
		l5.add(80);
		l5.add(50);
		l5.add(70);
		l5.add(60);
		l5.add(100);
		System.out.println(l5);
	}
}
