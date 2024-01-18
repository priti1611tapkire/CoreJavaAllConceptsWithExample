package com.hql;

import java.util.List;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.query.Query;





public class Test {
	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		//Query<Student> query=session.createQuery("");
		try{
			Student stu=new Student();
			stu.setRollno(6);
			stu.setName("Surya");
			stu.setAddress("Nanded");

			session.save(stu);
			session.beginTransaction().commit();
		}
		catch (Exception e) {
			// TODO: handle exception
		}

//		Query<Student> query=session.createQuery("from Student");
//		List<Student> list=query.getResultList();
//		for(Student stu:list){
//			System.out.println(stu.getRollno());
//			System.out.println(stu.getName());
//			System.out.println(stu.getAddress());
//		}
//		
//		System.out.println("=================");
//
//		
//		Query<Student> query1=session.createQuery("from Student where rollno=:rollno");
//		query1.setParameter("rollno", 3);
//		Student stu1=query1.getSingleResult();
//		System.out.println(stu1.getRollno());
//		System.out.println(stu1.getName());
//		System.out.println(stu1.getAddress());
//		
//		
//		EntityTransaction tx=session.beginTransaction();
//		Query<Student> query2=session.createQuery("update Student set name=:name where rollno=:rno");
//		query2.setParameter("name", "Rushi");
//		query2.setParameter("rno", 3);
//		query2.executeUpdate();
//		System.out.println("update succesfully");
//		
		//EntityTransaction tx1=session.beginTransaction();
		Query<Student> query3=session.createQuery("delete from Student where rollno=:rno");
		query3.setParameter("rno", 4);
		query3.executeUpdate();

//		System.out.println("deleted successfully");
//		tx.commit();
//		
		
	}
}
