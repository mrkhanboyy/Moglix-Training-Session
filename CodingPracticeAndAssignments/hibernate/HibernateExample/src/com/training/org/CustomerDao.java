package com.training.org;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CustomerDao {

	public static void main(String[] args) throws UnsupportedEncodingException {
		StandardServiceRegistry sq = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(sq).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
//		
		Base64.Encoder encoder = Base64.getEncoder();
		String pass = encoder.encodeToString("password".getBytes());

		Customer c1 = new Customer(3, "rizwan", 2000.0, "123456", pass, "0123456789", "xyz@gmail.com");
		session.save(c1);
		t.commit();
		session.close();
		factory.close();
		System.out.println("customer record saved successfully");
	}
}



//
//public class EncryptUtil {
//	public static String encrypt(String password) {
//		byte[] bytesOfPassword;
//		byte[] encrypted = null;
//		try {
//			bytesOfPassword = password.getBytes("UTF-8");
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			encrypted = md.digest(bytesOfPassword);
//		} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		return new String(encrypted, StandardCharsets.UTF_8);
//	}
//}
