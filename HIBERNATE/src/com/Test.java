package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
//	Address a=new Address();
//	a.setTaddress("PUNE");
//	a.setPaddress("abad");
//	Student s=new Student();
//	s.setName("Reema");
//	s.setAddress(a);
//	a.setStudent(s);
//	session.save(s);
//	session.save(a);
//	session.beginTransaction().commit();
//	System.out.println("DONE");
//	
//	Student s=session.get(Student.class, 1);
//	System.out.println(s.getRollno());
//	System.out.println(s.getName());
//	System.out.println(s.getAddress().getPaddress());
//	System.out.println(s.getAddress().getTaddress());
	
	
//	Student s1=session.load(Student.class, 1);
//	System.out.println(s1.getRollno());
//	System.out.println(s1.getName());
//	System.out.println(s1.getAddress().getPaddress());
//	System.out.println(s1.getAddress().getTaddress());
	
//	Query<Student> query=session.createQuery("from Student");
//	List<Student> list=query.getResultList();
//	for(Student stu:list){
//		System.out.println(stu.getRollno());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddress().getTaddress());
//		System.out.println(stu.getAddress().getPaddress());
//		System.out.println("========");
//	}
//	
//	
////	Query<Student> query1=session.createQuery("select name from Student");
//	Query<Student> query1=session.createQuery("select name from Student");
//	List<Student> list1=query.getResultList();
//	for(Student stu:list1){
//		//System.out.println(stu.getRollno());
//		System.out.println(stu.getName());
////		System.out.println(stu.getAddress().getTaddress());
////		System.out.println(stu.getAddress().getPaddress());
//	System.out.println("========");
		
		
//		Criteria c=session.createCriteria(Student.class);
//		c=c.setProjection(Projections.property("name"));
	
	CriteriaBuilder b=session.getCriteriaBuilder();
	CriteriaQuery<String> query=b.createQuery(String.class);
	
	Root<Student> root=query.from(Student.class);
	
	query.select(root.get("name"));
	
	Query<String> hq=session.createQuery(query);
	
	List<String> list=hq.getResultList();
	for(String nm:list){
		System.out.println(nm);
	}
//	
//	System.out.println("=============================");
//	
//	CriteriaBuilder b1=session.getCriteriaBuilder();
//	CriteriaQuery<Integer> query1=b1.createQuery(Integer.class);
//	
//	Root<Student> root1=query1.from(Student.class);
//	
//	query1.select(root1.get("rollno"));
//	
//	Query<Integer> hq1=session.createQuery(query1);
//	
//	List<Integer> list1=hq1.getResultList();
//	for(Integer nm:list1){
//		System.out.println(nm);
//	}
	
	}

}
//}
