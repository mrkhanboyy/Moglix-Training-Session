package com.training.org;

public class MainFile {
 public static void main(String[] args) {
	 HibernateUtil hb = new HibernateUtil();
	 System.out.println(hb.getSessionFactory().openSession().save(new Employee()));
	
}
}
