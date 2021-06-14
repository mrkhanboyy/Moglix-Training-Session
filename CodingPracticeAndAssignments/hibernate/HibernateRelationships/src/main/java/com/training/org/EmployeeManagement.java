package com.training.org;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeManagement {

	private static SessionFactory factory;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		factory=new Configuration().configure().buildSessionFactory();
		
		EmployeeManagement e1=new EmployeeManagement();
		Address ad=new Address("ABC Street", "Pune","411045");
		
		Employee emp1 =new Employee("Anish","henna",100000,ad);
		e1.addEmployee(emp1);
		
	}
	
	
	public Address addAddress(Address address) {
		Session session=factory.openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		Address address1=new Address(address.getStreet(),address.getCity(),address.getZipCode());
		session.save(address1);
		tx.commit();	
		return address;		
	}

	
	public int addEmployee(Employee emp) {
		Session session=factory.openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		Employee e1=new Employee(emp.getFirstName(),emp.getLastName(),emp.getSalary(),emp.getAddress());
		Integer employeeID=(Integer)session.save(e1);
		tx.commit();
		return employeeID;
	}
	
}
