package com.onetoone_Bi;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	
	
	PersonBill pn=new PersonBill();
	pn.setBillid(111);
	pn.setMeterId(1212);
	pn.setMobBill(2300);
	pn.setHomeRent(15200);
	
	PersonP p=new PersonP();
	p.setId(2);
	p.setName("Priti");
	p.setAddress("Aurangabad");
	p.setPancard(pn);
	pn.setPersonp(p);
	session.save(p);
	session.beginTransaction().commit();
	
}
}
