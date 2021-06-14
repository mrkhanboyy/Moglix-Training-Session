package com.training.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class UserDao {
	
//	private UserDatabaseOperations userDb;
//	
//	UserDao(){
//		this.userDb = new UserDatabaseOperations();
//	}
	
//	public static int register(User u) {
//		int i = 0;
//		Session session = new Configuration().configure().buildSessionFactory().openSession();
//
//		Transaction t = session.beginTransaction();
//		t.begin();
//
//		i = (Integer) session.save(u);
//
//		t.commit();
//		session.close();
//
//		return i;
//
//	}

//	public static void saveUser(User user) {
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//		
//		
//		User s1=new User(user.getName(),user.getEmail(),user.getPassword());
//		
//		session.save(s1);
//		t.commit();
//		System.out.println("successfully saved");
//		factory.close();
//		session.close();
//	}
}
