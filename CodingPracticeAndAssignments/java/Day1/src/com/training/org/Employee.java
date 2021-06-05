package com.training.org;

import java.util.Scanner;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("Default constructor is called");
		empId=0;
		name="";
		salary=0;
	}
	
	public Employee(int empId,String name,double salary) {
		System.out.println("Parameterised constructor is called");
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public void showEmployeeDetails() {
		System.out.println("Employee details are ");
		System.out.println("EmpId : "+empId+"\nName : "+name+"\nSalary : "+salary );
	}
	
	
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter empId ");
		int id=myObj.nextInt();
		System.out.println("Enter name");
		myObj.nextLine();
		String name=myObj.nextLine();
		System.out.println("Enter salary");
		double sal=myObj.nextDouble();
		
		Employee e1=new Employee(id,name,sal);
		e1.showEmployeeDetails();
		myObj.close();
	}
	
	
}
