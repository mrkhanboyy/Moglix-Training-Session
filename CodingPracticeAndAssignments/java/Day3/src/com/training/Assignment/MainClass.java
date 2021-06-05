package com.training.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
//		Employee e = new WagesEmployee();
//		e.acceptEmployeedetails();
//		e.calculateNetSalary();
//		System.out.println(e);
		
		
		
//		Employee e = new SalesEmployee();
//		e.acceptEmployeedetails();
//		e.calculateNetSalary();
//		System.out.println(e);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
				char ch='Y';
				Scanner input=new Scanner(System.in);
		
				do {
					System.out.println("1] Add new Record\n2] Update record\n3] Delete record\n4] Display records\n\nEnter your choice\n");
					int choice=input.nextInt();
		
					switch(choice) {
	
					case 1:
						Employee e1 = new WagesEmployee();
						e1.acceptEmployeedetails();
						employeeList.add(e1);
						break;
		
					case 2:
						Employee e2=new WagesEmployee(1, 1, 2020, 8.0, 10000, new DateOfBirth(1, 1, 1990), new Address("city", "pincode"));
						employeeList.set(1,e2);
						break;
		
					case 3:
						employeeList.remove(0);
						break;
						
					case 4:
						for (Employee employee : employeeList) {
							System.out.println(employee);
						}
						break;
		
					}
		
					System.out.println("Do you want to conti.....");
					ch=input.next().charAt(0);
				}while(ch=='y'||ch=='Y');			
				input.close();
	}
	
	
}
