package com.training.Assignment;

import java.time.YearMonth;
import java.util.Scanner;

public class WagesEmployee extends Employee {

	
	private int day;
	private int month;
	private int year;
	private double netSalary;
	private double numberOfWorkingHours;
	
	public WagesEmployee() {
		super();
	}
	
	public WagesEmployee(int day, int month, int year, double numberOfWorkingHours, double basicSalary, DateOfBirth dateOfbirth, Address address ) {
		super(basicSalary, dateOfbirth, address);
		this.day = day;
		this.month = month;
		this.year = year;
		this.netSalary = 0;
		this.numberOfWorkingHours = numberOfWorkingHours;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getNumberOfWorkingHours() {
		return numberOfWorkingHours;
	}

	public void setNumberOfWorkingHours(double numberOfWorkingHours) {
		this.numberOfWorkingHours = numberOfWorkingHours;
	}

	
	

	@Override
	public void acceptEmployeedetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city and pincode");
		super.setAddress(new Address(sc.nextLine(), sc.nextLine()));
		System.out.println("enter date of birth as day, month, year"); 
		super.setDateOfbirth(new DateOfBirth(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		System.out.println("enter number of working hours");
		this.numberOfWorkingHours = Double.parseDouble(sc.nextLine());
		System.out.println("enter basic salary");
		super.setBasicSalary(Double.parseDouble(sc.nextLine()));
		System.out.println("enter date of salary month as day, month, year");
		this.day = Integer.parseInt(sc.nextLine());
		this.month = Integer.parseInt(sc.nextLine());
		this.year = Integer.parseInt(sc.nextLine());
		sc.close();
	}
	
	@Override
	public String toString() {
		return "WagesEmployee [day=" + day + ", month=" + month + ", year=" + year + ", netSalary=" + netSalary
				+ ", numberOfWorkingHours=" + numberOfWorkingHours +" "+ super.toString()+"]";
	}

	@Override
	public void calculateNetSalary() {
		int days = YearMonth.of(this.year, this.month).lengthOfMonth();;
		this.netSalary = ((super.getBasicSalary()/days)/8)*this.numberOfWorkingHours;
	}
	
	
	
	
}
