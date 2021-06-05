package com.training.Assignment;

import java.util.Scanner;

public class SalesEmployee extends Employee{

	private int sales;
	private double netSalary;
	
	public SalesEmployee() {
		super();
	}

	public SalesEmployee(int sales, double basicSalary, DateOfBirth dateOfbirth, Address address) {
		super(basicSalary, dateOfbirth, address);
		this.sales = sales;
		this.netSalary = 0.0;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + ", netSalary=" + netSalary + ",  " + super.toString() + "]";
	}
	
	@Override
	public void acceptEmployeedetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city and pincode");
		super.setAddress(new Address(sc.nextLine(), sc.nextLine()));
		System.out.println("enter date of birth as day, month, year"); 
		super.setDateOfbirth(new DateOfBirth(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		System.out.println("enter basic salary");
		super.setBasicSalary(Double.parseDouble(sc.nextLine()));
		System.out.println("enter sales");
		this.sales = Integer.parseInt(sc.nextLine());
		sc.close();
	}
	
	
	@Override
	public void calculateNetSalary() {
		if(sales < 5000) {
			this.netSalary = ((super.getBasicSalary()*2)/100)+super.getBasicSalary();
		}else if(sales >= 5000 && sales < 7000) {
			this.netSalary = ((super.getBasicSalary()*5)/100)+super.getBasicSalary();
		}else if(sales >= 5000 && sales < 7000) {
			this.netSalary = ((super.getBasicSalary()*7)/100)+super.getBasicSalary();
		}else if(sales >= 10000) {
			this.netSalary = ((super.getBasicSalary()*10)/100)+super.getBasicSalary();
		}
	}
	

}
