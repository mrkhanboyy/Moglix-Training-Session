package com.training.org.Employee.abstraction;

interface Myinterface{
	public void method1();
	public void method2();
}

class Demo implements Myinterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method 1 from demo");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method 2 from demo");
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {
		
		Demo m = new Demo();
		m.method1();
		m.method2();
	}
	
}
