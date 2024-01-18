package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {


		User u=new User();
		u.setId(1);
		u.setName("Priti");

		User u1=new User();
		u1.setId(11);
		u1.setName("Shar");

		User u3=new User();
		u3.setId(111);
		u3.setName("Sneha");

		List<User> l=new ArrayList<>();
		l.add(u);
		l.add(u1);
		l.add(u3);
		 
	List<User> list=l.stream().filter(e->e.getName().startsWith("S")).collect(Collectors.toList());
	System.out.println(list.add(u1));
	System.out.println("===========================");
		
		l.forEach(user-> {
			System.out.println(user.getId());
			System.out.println(user.getName());
		});
		for(User u4:l){
			System.out.println(u4.getId());
			System.out.println(u4.getName());
			
			
			
		}

	}
}
