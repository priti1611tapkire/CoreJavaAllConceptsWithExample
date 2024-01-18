package com.tablePerClass;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Karvenagarksk k=new Karvenagarksk();
		
		k.setRollno(1);
		k.setName("Priti");
		k.setRegularbatch("Java");
		
		Akurdisks a=new Akurdisks();
		a.setRollno(2);
		a.setName("Yogita");
		a.setWeekendbatch("Python");
		
		session.save(k);
		session.save(a);
		session.beginTransaction().commit();
		System.out.println("done");
	}

}
