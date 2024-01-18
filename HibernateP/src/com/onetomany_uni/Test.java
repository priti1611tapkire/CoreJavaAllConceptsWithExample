package com.onetomany_uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	List<CustomerOrder> list=new ArrayList<CustomerOrder>();
	
	Customer c=new Customer();
	c.setCid(1);
	c.setName("Priti");
	c.setAddress("Aurangabad");
	
	CustomerOrder co=new CustomerOrder();
	co.setCoid(112);
	co.setProductName("Washing Machine");
	
	CustomerOrder co1=new CustomerOrder();
	co1.setCoid(113);
	co1.setProductName("LED");
	
	list.add(co);
	list.add(co1);
	c.setCorder(list);
	
	System.out.println("done");
	session.save(c);
	session.beginTransaction().commit();
	
	
}
}
