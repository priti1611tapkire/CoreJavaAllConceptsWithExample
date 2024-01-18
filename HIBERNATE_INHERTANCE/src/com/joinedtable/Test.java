package com.joinedtable;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Karvenagarks k=new Karvenagarks();
		
		k.setRollno(1);
		k.setName("Priti");
		k.setRegularbatch("Java");
		
		Akurdisk a=new Akurdisk();
		a.setRollno(2);
		a.setName("Yogita");
		a.setWeekendbatch("Python");
		
		session.save(k);
		session.save(a);
		session.beginTransaction().commit();
		System.out.println("done");
	}

}
