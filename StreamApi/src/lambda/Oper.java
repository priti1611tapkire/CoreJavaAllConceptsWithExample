package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class Oper {
	public static void main(String[] args) {


		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30); 
		list1.add(15);
		list1.add(16); 

		list1.stream().sorted().forEach(System.out::println);
		List<Integer> list=list1.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(list);

		List<Integer> list2=list1.stream().map(e->e/2).collect(Collectors.toList());
		System.out.println(list2);

		Integer i=list1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(i);

		Integer i1=list1.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println(i1);

	}

}
