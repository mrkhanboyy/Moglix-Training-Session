package com.training.org.Employee;

class SalesEmployee extends Employee{
	
	private int sales;
	private double netSalary;
	
	
	public SalesEmployee() {
		super();
		System.out.println("Default constructor of SalesEmployee is called");
		sales=0;
		netSalary=0;
	}


	public SalesEmployee(int empId,String name,double basicSalary,int sales) {
		super(empId,name,basicSalary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales = sales;
		this.netSalary = 0.0;
		
	}
	
	
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
	


	@Override
	public String toString() {
		
		return super.toString()+"\nSalesEmployee [sales=" + sales + ", netSalary=" + netSalary + "]";
	}
	
}

