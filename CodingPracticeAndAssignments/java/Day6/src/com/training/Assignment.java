package com.training;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

class Employee {

	private String name;
	private Double salary;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(String name, Double salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}


public class Assignment {

//	public static void main(String[] args) {
//		ArrayList<Employee> list = new ArrayList<Employee>();
//		
//		list.add(new Employee("emp1", 20000.0, "male"));
//		list.add(new Employee("emp2", 21000.0, "male"));
//		list.add(new Employee("emp3", 5000.0, "female"));
//		list.add(new Employee("emp4", 50000.0, "female"));
//		list.add(new Employee("emp5", 100000.0, "female"));
//		list.add(new Employee("emp6", 7000.0, "male"));
//		list.add(new Employee("emp7", 30000.0, "male"));
//		list.add(new Employee("emp8", 25000.0, "male"));
//		list.add(new Employee("emp9", 15000.0, "female"));

//		Double a = list
//	    .stream()
//	    .map(Employee :: getSalary)
//	    .collect(Collectors.reducing(Double :: max)).get();
//		System.out.println("salary  == "+a);
//		
//		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(1).forEach(System.out::println);
//		
//
//		Map<String, Optional<Employee>> avgAgeOfMaleAndFemale=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy((Comparator.comparingDouble(Employee::getSalary)))));
//		
//		
//		System.out.println(avgAgeOfMaleAndFemale);
//		Map<String, Double> maxsalary = list.stream().collect(Collectors.groupingBy(s -> s.getGender(), Collectors.averagingDouble(Employee::getSalary)));

//	}

	
	//------------------------------------------using stack
	public static void main(String[] args) throws IOException {

		Stack<Employee> list = new Stack<Employee>();

		list.push(new Employee("emp1", 20000.0, "male"));
		list.push(new Employee("emp2", 21000.0, "male"));
		list.push(new Employee("emp3", 5000.0, "female"));
		list.push(new Employee("emp4", 50000.0, "female"));
		list.push(new Employee("emp5", 100000.0, "female"));

		FileOutputStream fout = new FileOutputStream("/home/moglix/Desktop/employeeList.txt", true);
		
		
		while (!list.isEmpty()) {
			fout.write((list.pop().toString()+"\n").getBytes());	
		}
		
		fout.close();
		System.out.println("written to file successfully");
		
	}
}
