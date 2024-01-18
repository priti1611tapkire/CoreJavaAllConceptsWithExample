package com;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	
	
	Pancard pn=new Pancard();
	pn.setPanNo(123);
	pn.setPanName("Priti Tapkire");
	
	Person p=new Person();
	p.setId(1);
	p.setName("Priti");
	p.setAddress("Aurangabad");
	p.setPancard(pn);
	
	session.save(p);
	session.beginTransaction().commit();
	
}
}
