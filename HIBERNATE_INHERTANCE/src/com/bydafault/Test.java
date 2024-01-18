package com.bydafault;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Karvenagarm k=new Karvenagarm();
	k.setRollno(1);
	k.setSname("Priti");
	k.setRegularbatch("JAVA");
	
	Akurdim a=new Akurdim();
	a.setRollno(2);
	a.setSname("Pari");
	a.setWeekendbatch("PYTHON");
	

	session.save(k);
	session.save(a);
	session.beginTransaction().commit();
	
	System.out.println("done");
	
}
}
