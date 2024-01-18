package com.pl;

import org.hibernate.Session;

public class Test {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Student s=new Student();
	

}
