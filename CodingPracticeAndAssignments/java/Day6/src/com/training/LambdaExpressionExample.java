package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//

//import java.util.ArrayList;
//
////interface MyInterface {
////	public int MyFunction();
////}
//
//interface StringFunction{
//	String run2(String a, String b);
//	
//}
//
//public class LambdaExpressionExample {

//public static void main(String[] args) {
//MyInterface m;
//m = () -> 110;
//System.out.println(m.MyFunction());
//}

//	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<Integer>();
//
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		a.forEach(num -> System.out.println(num));
//	}

//	public static void printFormatted(String str,StringFunction format) {
//		String result=format.run2(str, "");
//		System.out.println(result);
//	}
//	
//	public static void main(String[] args) {
//		StringFunction sf = (a,b) -> "hello"+a+b;
//		printFormatted("hello", sf);
//	}
//}

//-------------------------------------------------------------------------------------------------

//public class LambdaExpressionExample {
//	public static void main(String args[]) {
//		LambdaExpressionExample tester = new LambdaExpressionExample();
//		// with type declaration
//		MathOperation addition = (int a, int b) -> a + b;
//		// with out type declaration
//		MathOperation subtraction = (a, b) -> a - b;
//
//		// with return statement along with curly braces
//		MathOperation multiplication = (int a, int b) -> {
//			return a * b;
//		};
//
//		// without return statement and without curly braces
//		MathOperation division = (int a, int b) -> a / b;
//
//		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
//		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
//		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
//		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
//
//		// without parenthesis
//		GreetingService greetService1 = message -> System.out.println("Hello " + message);
//
//		// with parenthesis
//		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
//
//		greetService1.sayMessage("Mahesh");
//		greetService2.sayMessage("Suresh");
//	}
//
//	interface MathOperation {
//		int operation(int a, int b);
//	}
//
//	interface GreetingService {
//		void sayMessage(String message);
//	}
//
//	private int operate(int a, int b, MathOperation mathOperation) {
//		return mathOperation.operation(a, b);
//	}
	
	
	
//	public static void main(String[] args) {
//		i a = (c,b) -> c+b;
//		System.out.println(a.add(10, 10));
//	}
	
	
	
//	public static void main( String[] args ) {
//        // declare a reference to MyInterface
//        // assign a lambda expression to the reference
//        MyInterface ref = (str) -> {
//            String result = "";
//            for (int i = str.length()-1; i >= 0 ; i--)
//            result += str.charAt(i);
//            return result;
//        };
//        // call the method of the interface
//        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
//    }
//}
//
//interface MyInterface {
//    // abstract method
//    String reverse(String n);
//}
//
//interface i{
//	int add(int a, int b);
//}

//----------------------------------------------------------------------------------------------------------------------

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
	
}


public class LambdaExpressionExample{
	
	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Laptop", 10000));
		productList.add(new Product(4,"Machine", 30000));
		productList.add(new Product(2,"Microphone",345));
		productList.add(new Product(3,"TV", 4999));
		
		List<Float> pList = productList.stream()
		.filter(p->p.price>5000)
		.map(pm-> pm.price)
		.collect(Collectors.toList());
		System.out.println(pList);
	}
}