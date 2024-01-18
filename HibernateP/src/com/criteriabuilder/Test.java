package com.criteriabuilder;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
//		Students s=new Students();
//		s.setId(1);
//		s.setName("Priti");
//		s.setAddr("Abad");
//		s.setAge(25);
//		
//		Students s2=new Students();
//		s2.setId(2);
//		s2.setName("Prt");
//		s2.setAddr("Abad");
//		s2.setAge(28);
//		Students s3=new Students();
//		s3.setId(3);
//		s3.setName("Kriti");
//		s3.setAddr("Abad");
//		s3.setAge(35);
//		Students s4=new Students();
//		s4.setId(4);
//		s4.setName("Meena");
//		s4.setAddr("Abad");
//		s4.setAge(20);
//		
//		session.save(s);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
//		session.beginTransaction().commit();
//		System.out.println("okay");
		
		//Query<Integer> query=session.createQuery("select age from Students where age between 21 and 30");
		//Query<Integer> query=session.createNativeQuery("select age from Students order by age DESC");
		//Query<Integer> query=session.createNativeQuery("select age from Students order by age ASC");
		// Query<Integer> query=session.createNativeQuery("select age from Students order by age ASC");
		//Query<Integer> query=session.createNativeQuery("select min(age) as minimumage from Students");
		
		//List<Integer> list=query.getResultList();
		//list.forEach(e-> System.out.println(e));
		
		
		Query<Students> query=session.createNativeQuery("select * from Students where name like 'p%'", Students.class);
		List<Students> list1=query.getResultList();
		list1.forEach(e->{
			System.out.println(e);
		});
//		
//		
//		Query<Students> query2=session.createNativeQuery("select * from Students where age in (20,25,35)", Students.class);
//		List<Students> list2=query2.getResultList();
//		//List<String> list2=query2.getResultList();
//		list2.forEach(e->System.out.println(e));
		
		
		
//		Query<Object[]> query3=session.createNativeQuery("select id, name, age from Students");
//		List<Object[]> list=query3.getResultList();
//		
//		for(Object[] o:list){
//			System.out.println(o[0]);
//			System.out.println(o[1]);
//			System.out.println(o[2]);
//		}
		
//		Query<String> query3=session.createNativeQuery("select name from Students");
//		List<String> list=query3.getResultList();
//		list.forEach(e-> System.out.println(e));
		
		
	}
}
