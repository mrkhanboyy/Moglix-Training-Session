package com.training.innerclass;

class Outer{
	void outerMethod() {
		System.out.println("outer method outer class");
		
		
		class Inner{
			void innerMethod() {
				System.out.println("Inner method inner class");
			}
		}
		
		Inner i=new Inner();
		i.innerMethod();
	}
}


public class InnerClassExample {
	
	public static void main(String[] args) {
		Outer o=new Outer();
		o.outerMethod();
	}

}

