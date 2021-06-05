package com.training.Assignment;

import java.util.Scanner;

public class Employee implements OrganizationMethods {

	private Double basicSalary;
	private DateOfBirth dateOfbirth;
	private Address address;
	
	public Employee() {
		
	}
	
	
	

	public Employee(double basicSalary, DateOfBirth dateOfbirth, Address address) {
		super();
		this.basicSalary = basicSalary;
		this.dateOfbirth = dateOfbirth;
		this.address = address;
	}
	
	




	public Double getBasicSalary() {
		return basicSalary;
	}




	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}




	public DateOfBirth getDateOfbirth() {
		return dateOfbirth;
	}




	public void setDateOfbirth(DateOfBirth dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public void acceptEmployeedetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city and pincode");
		this.setAddress(new Address(sc.nextLine(), sc.nextLine()));
		System.out.println("enter date of birth as day, month, year"); 
		this.setDateOfbirth(new DateOfBirth(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		System.out.println("enter basic salary");
		this.setBasicSalary(Double.parseDouble(sc.nextLine()));
		sc.close();
	}

	@Override
	public void calculateNetSalary() {
		System.out.println(basicSalary);
		
	}




	@Override
	public String toString() {
		return "Employee [basicSalary=" + basicSalary + ", dateOfbirth=" + dateOfbirth + ", address=" + address + "]";
	}
	
	

}
