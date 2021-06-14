package com.training.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyMangement {

	public static void main(String args[]) {
		
		

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

//		Query qry= session.createQuery("select v.vendorName, c.customerName from Vendor "
//				+ "v Left Join v.children c");

//		String sql = "SELECT * FROM EMPLOYEE2";
//		SQLQuery query = session.createSQLQuery(sql);
//		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		List results = query.list();
//		
//		System.out.println(results);

		Query qry = session.createQuery("from Vendor as vend where vend.vendorName like '%F%'");
		List l = qry.list();

		for (Object object : l) {
			Vendor v = (Vendor) object;
			System.out.println(v.getVendorName());
		}

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object rows[] = (Object[]) it.next();
			System.out.println(rows[0] + " -- " + rows[1]);
		}

		// parent object
		Vendor v = new Vendor();

		v.setVendorId(101);
		v.setVendorName("FVendor");

		// creating 3 child objects
		Customer c1 = new Customer();

		c1.setCustomerId(504);
		c1.setCustomerName("customer4");

		Customer c2 = new Customer();

		c2.setCustomerId(505);
		c2.setCustomerName("customer5");

		Customer c3 = new Customer();

		c3.setCustomerId(506);
		c3.setCustomerName("customer6");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();
		session.close();

		factory.close();

	}

}
