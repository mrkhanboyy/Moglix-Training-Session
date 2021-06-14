package com.training.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmployeeDao {
	
	public static void main(String[] args) {
		
		
		StandardServiceRegistry sq = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(sq).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee(1, "rizwan", "khan");
		
		session.save(emp);
		t.commit();
		session.close();
		factory.close();
		System.out.println("record saved");
	}

}
