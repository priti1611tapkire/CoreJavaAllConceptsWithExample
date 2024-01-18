package com;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
	public static void main(String[] args)  {

		StandardServiceRegistry ss=new StandardServiceRegistryBuilder().configure("employee.cfg.xml").build(); 
		Metadata meta = new MetadataSources(ss).getMetadataBuilder().build(); 
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t =session.beginTransaction();


		Employee e1=new Employee();    
		e1.setId(3);    
		e1.setFirstName("Shivansh");    
		e1.setLastName("B");    

		session.save(e1);  
		t.commit();  
		System.out.println("successfully saved");    
		factory.close();  
		session.close();    

	}
}
