package com.training.org.Employee;



class Employee {
	private int empId;
	private String name;
	private double basicSalary;
	
	
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		empId=0;
		name="";
		basicSalary=0;
	}


	public Employee(int empId, String name, double basicSalary) {
		System.out.println("Parameterised constructor of Employee is called");
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}


	public double getBasicSalary() {
		return this.basicSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}

}









//public class Employee {
//
//	
//	private int id;
//	private String name;
//	private int salary;
//	
////	default constructor
//	public Employee() {
//		super();
//	}
//
////	Parameterized constructor
//	public Employee(int id, String name, int salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//
////	toString
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//	
////	getter and setters
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
//	
//
//	private void acceptValues() {
//		Scanner input=new Scanner(System.in);
//		
//		System.out.println("Enter id");
//		id=input.nextInt();
//
//		input.nextLine();
//		System.out.println("Enter name");
//		name=input.nextLine();
//
//
//		System.out.println("Enter salary");
//		salary=input.nextInt();
//
//		
//	}
//	
//	
//	
////	main
//	public static void main(String[] args) {
//		ArrayList<Employee> employeeList = new ArrayList<Employee>();
//
//		char ch='Y';
//		Scanner input=new Scanner(System.in);
//
//		do {
//			System.out.println("1] Add new Record\n2] Update record\n3] Delete record\n4] Display records\n\nEnter your choice\n");
//			int choice=input.nextInt();
//
//			switch(choice) {
//
//			case 1:
//				Employee e1=new Employee();
//				e1.acceptValues();
//				employeeList.add(e1);
//				break;
//
//			case 2:
//				Employee e2=new Employee(101,"MAnu",50000);
//				employeeList.set(1,e2);
//				break;
//
//			case 3:
//				employeeList.remove(3);
//				break;
//			case 4:
//				for (Employee employee : employeeList) {
//					System.out.println(employee);
//				}
//				break;
//
//			}
//
//			System.out.println("Do you want to conti.....");
//			ch=input.next().charAt(0);
//		}while(ch=='y'||ch=='Y');
//		
//		
//		input.close();
//		
//	}
//
//
//	
//	
//	
//	
//}
