package com.manytoone;

import java.util.ArrayList;


import java.util.List;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		Customer c1=new Customer();
		c1.setId(2);
		c1.setName("Rohit");
		c1.setAddress("KKN");//1st Cust

		CustomerOrder co=new CustomerOrder();
		co.setCid(25);
		co.setPname("TV");
		co.setCst(c1);//2

		CustomerOrder co2=new CustomerOrder();
		co2.setCid(50);
		co2.setPname("MOBILE");
		co2.setCst(c1);

		Customer c=new Customer();
		c.setId(1);
		c.setName("Priti");
		c.setAddress("Abad");

		CustomerOrder co3=new CustomerOrder();
		co3.setCid(30);
		co3.setPname("Washing Machine");
		co3.setCst(c);

		CustomerOrder co4=new CustomerOrder();
		co4.setCid(60);
		co4.setPname("Charger");
		co4.setCst(c);

		c1.getCorder().add(co);
		c1.getCorder().add(co2);
		c.getCorder().add(co3);
		c.getCorder().add(co4);

		session.save(c);
		session.save(c1);
		session.beginTransaction().commit();
	}
}
