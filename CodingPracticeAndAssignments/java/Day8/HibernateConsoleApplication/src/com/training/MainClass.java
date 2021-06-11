package com.training;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainClass {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("employee.cfg.xml").build();  
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();  

		Employee e1=new Employee(101,"Tanihs",1000);
//		e1.setId(1);    
//		e1.setName("tanish");    
//		e1.setSalary(10000);    

		session.save(e1);  
		t.commit();  
		System.out.println("successfully saved");    
		factory.close();  
		session.close();     
	}
}
