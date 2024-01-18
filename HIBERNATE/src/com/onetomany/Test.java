package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;


public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
//		List<PersonBills> plist=new ArrayList<>();
//		PersonBills pb=new PersonBills();
//		pb.setMobbill("25000");
//		pb.setElectricitybill("58000");
//		pb.setWaterbill("2500");
//		plist.add(pb);
//		Person p=new Person();
//		p.setId(1);
//		p.setName("PRITI");
//		p.setAddress("ABAD");
//		p.setPersonbills(plist);
//		session.save(p);
//		session.beginTransaction().commit();
//		System.out.println("done");
		
		List<PersonBills> plist=new ArrayList<>();
		PersonBills pb=new PersonBills();
		pb.setPbid(25);
		pb.setMobbill("2500");
		pb.setElectricitybill("5000");
		pb.setWaterbill("5800");
		plist.add(pb);
		
		Person p=new Person();
		p.setId(1);
		p.setName("PRITI");
		p.setAddress("ABAD");
		p.setPersonbills(plist);
		
		pb.setPerson(p);
	
		session.save(pb);
		session.beginTransaction().commit();
		System.out.println("done");
	}

}
