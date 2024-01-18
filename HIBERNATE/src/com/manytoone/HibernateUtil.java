package com.manytoone;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
	private static StandardServiceRegistry registry=null;
	
	private static SessionFactory sf=null;
	
	public static SessionFactory getSessionFactory(){
		
		if(sf==null){
			Map<String, Object> m=new HashMap<>();
			m.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			m.put(Environment.URL, "jdbc:mysql://localhost:3306/mprac05_03");
			m.put(Environment.USER, "root");
			m.put(Environment.PASS, "root");
			
			m.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			m.put(Environment.HBM2DDL_AUTO, "update");
			m.put(Environment.SHOW_SQL, "true");
			
			registry=new StandardServiceRegistryBuilder().applySettings(m).build();
			MetadataSources ms=new MetadataSources(registry).addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerOrder.class);
			Metadata md=ms.getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
		}
		return sf;
		
	}

}
