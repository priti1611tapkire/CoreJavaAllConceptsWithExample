package com.onetomany_bi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		Customers c=new Customers();
		c.setCid(1);
		c.setName("Priti");
		c.setAddress("Auranagabad");

		List<Products> list=new ArrayList<>();
		Products p=new Products();
		p.setPid(11);
		p.setPname("MOBILE");
		p.setPrise(50000);

		Products p1=new Products();
		p1.setPid(22);
		p1.setPname("LAPTOP");
		p1.setPrise(70000);
		list.add(p);
		list.add(p1);

		c.setProducts(list);

		session.save(c);
		session.beginTransaction().commit();
		System.out.println("dones");

	}
}
