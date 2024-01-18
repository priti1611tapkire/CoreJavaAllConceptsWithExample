package com.singletable;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Karvenagars k=new Karvenagars();
	k.setRollno(1);
	k.setName("PRITI");
	k.setRegularbatch("Java");
	
	Akurdis a=new Akurdis();
	a.setRollno(2);
	a.setName("Yogita");
	a.setWeekendbatch("Python");
	session.save(k);
	session.save(a);
	session.beginTransaction().commit();
	System.out.println("ok");
}
}
