package com.training.anonymousInnerClass;


class Demo{
	void show() {
		System.out.println("Show method demo class");
	}
}

class Flavor1Demo{
	static Demo d=new Demo() {
		void show() {
			super.show();
			System.out.println("Flavor1.demo.show");
		}
	};
}






public class AnonymousInnerClassExample {
public static void main(String[] args) {
	Flavor1Demo.d.show();
	
}
}
