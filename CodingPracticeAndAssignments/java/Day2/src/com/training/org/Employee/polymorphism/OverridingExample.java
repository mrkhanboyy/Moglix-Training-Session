package com.training.org.Employee.polymorphism;

//class Abc{
//	public Abc() {
//		System.out.println("Abc is called");
//	}
//	public void show() {
//		System.out.println("show method from Abc");
//		
//	}
//}
//
//class Xyz extends Abc{
//	public Xyz() {
//		System.out.println("Xyz is called");
//	}
//	
//	@Override
//	public void show() {
//		System.out.println("show method from Xyz");
//	}
//	
//}
//
//

class Machine{
	public void start() {
		System.out.println("Machine is started");
	}
}


class Laptop extends Machine{
	@Override
	public void start() {
		System.out.println("Laptop is started");
	}
	
	public void stop() {
		System.out.println("Laptop is stopped");
	}
}


public class OverridingExample {

	public static void main(String[] args) {
		Machine machine=new Machine();
		machine.start();
		
		Laptop laptop=new Laptop();
		laptop.start();
		laptop.stop();
		
		
		Machine machine1=new Machine();
		Laptop laptop1=(Laptop)machine1;
		
	}
}
