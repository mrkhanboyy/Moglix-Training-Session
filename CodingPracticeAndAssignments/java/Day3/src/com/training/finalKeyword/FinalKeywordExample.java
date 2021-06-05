package com.training.finalKeyword;

final class Test{
	
	public final int a = 10;
	public int b;
	
	public void add() {
		System.out.println(a+b);
	}
	
	public final void subtract() {
		System.out.println(Math.abs(a-b));
	}
	
}

//class Test2 extends Test{}       //error cannot extend final class


//class Test3 extends Test{
//	public void subtract() {       // error cannot override final method
//		
//	}
//}

public class FinalKeywordExample {
	
	public static void main(String[] args) {
		Test t = new Test();
		
//		t.a = 10;               //error cannot reassign final variable
		t.b = 20;
		t.add();
	}
	
}
