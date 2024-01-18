package com.practi;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		Employee e=new Employee();
		e.setId(4);
		e.setName("jjjj");
		System.out.println(e);
		session.save(e);
		
		e.setName("mahi");
		System.out.println(e);
		session.beginTransaction().commit();
//		Transaction tx=session.beginTransaction();
//		
//		
//		Employee e1=session.get(Employee.class, 1);
//		System.out.println("before" +e1);
//		e1.setName("addd");
//	//	session.update(e1);
//		session.flush();
//		System.out.println("After" +e1);
//		//tx.commit();

	}


}
