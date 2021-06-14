package com.training.org;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;





public class UserDatabaseOperations {

	
	public static SessionFactory getSessionFactory() {
		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configObj = new Configuration();
		configObj.addAnnotatedClass(com.training.org.User.class);
		configObj.configure("hibernate.cfg.xml");
		
		
	

		// Since Hibernate Version 4.x, Service Registry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 

		// Creating Hibernate Session Factory Instance
		SessionFactory factoryObj = configObj.buildSessionFactory(serviceRegistryObj);		
		return factoryObj;
	}
	
	public static Integer createRecord(User user) {
		Session sessionObj = getSessionFactory().openSession();

		//Creating Transaction Object  
		Transaction transObj = sessionObj.beginTransaction();
		sessionObj.save(user);

		// Transaction Is Committed To Database
		transObj.commit();

		// Closing The Session Object
		sessionObj.close();
		return user.getId();
	}
	
	
	public static User findRecordById(Integer userId) {
		Session sessionObj = getSessionFactory().openSession();
		User stu = (User) sessionObj.get(User.class, userId);
		
		// Closing The Session Object
		sessionObj.close();
		return stu;
	}
	
	public static void deleteRecord(Integer userId) {
		Session sessionObj = getSessionFactory().openSession();

		//Creating Transaction Object  
		Transaction transObj = sessionObj.beginTransaction();
		User userObj = findRecordById(userId);
		if(userObj != null) {			
			sessionObj.delete(userObj);
		}

		// Transaction Is Committed To Database
		transObj.commit();

		// Closing The Session Object
		sessionObj.close();

	}
	
	public static void deleteAllRecords() {
		Session sessionObj = getSessionFactory().openSession();

		//Creating Transaction Object  
		Transaction transObj = sessionObj.beginTransaction();
		Query queryObj = sessionObj.createQuery("DELETE FROM User");
		queryObj.executeUpdate();

		// Transaction Is Committed To Database
		transObj.commit();

		// Closing The Session Object
		sessionObj.close();
	}
	
	
	public static void updateRecord(User userObj) {
		Session sessionObj = getSessionFactory().openSession();

		//Creating Transaction Object  
		Transaction transObj = sessionObj.beginTransaction();
		User stuObj = (User) sessionObj.load(User.class, userObj.getId());
		stuObj.setName(userObj.getName());
		stuObj.setEmail(userObj.getEmail());
		stuObj.setPassword(userObj.getPassword());

		// Transaction Is Committed To Database
		transObj.commit();

		// Closing The Session Object
		sessionObj.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public static List<User> displayRecords() {
		Session sessionObj = getSessionFactory().openSession();
		List<User> usersList = sessionObj.createQuery("FROM User").list();

		// Closing The Session Object
		sessionObj.close();
		return usersList;
	}
}
