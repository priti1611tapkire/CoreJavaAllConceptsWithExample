package com.noargcon;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		//	Query<Student> q=session.createQuery("From Student");
		//	List<Student> l=q.getResultList();
		//	Iterator<Student> itr=l.iterator();
		//	while(itr.hasNext()){
		//		Student s=itr.next();
		//		System.out.println(s.getRollno());
		//		System.out.println(s.getName());
		//		System.out.println(s.getAddress());
		//	}
		//Query<Student> q=session.createNamedQuery("selectAll");
		//	List<Student> list=q.getResultList();
		//	list.forEach(n -> System.out.println(n));
		//	
		//	System.out.println("===================");
		//	
		//	Query<Student> q1=session.createNamedQuery("selectByrollno");
		//	q1.setParameter("rno", 1);
		//	Student s=q1.getSingleResult();
		//	System.out.println(s);
		//	System.out.println("===================");
		//	//list1.forEach(n -> System.out.println(n));
		//	Transaction tx=session.beginTransaction();
		//	Query<Student> q2=session.createNamedQuery("updateByrollno");
		//	q2.setParameter("name", "Riddhi");
		//	q2.setParameter("rno", 1);
		//	q2.executeUpdate();
		//	tx.commit();
		//	
		//	System.out.println("===================");
		//	Transaction tx1=session.beginTransaction();
		//	Query<Student> q3=session.createNamedQuery("deleteByrollno");
		//	q3.setParameter("rno", 6);
		//	q3.executeUpdate();
		//	tx1.commit();


Query<Student> q1=session.createNativeQuery("selectAll");
List<Student> s=q1.getResultList();
s.forEach(n -> System.out.println(n));
	}
}
