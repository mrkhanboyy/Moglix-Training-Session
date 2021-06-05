package com.training.org;

import java.util.Scanner;

public class HelloWorld {

	private static Scanner sc;

//	public static void main(String[] args) {
//		System.out.println("HelloWorld");
//
//		Scanner sc = new Scanner(System.in);
////		System.out.println("enter 2 numbers");
////		int num1 = sc.nextInt();
////		int num2 = sc.nextInt();
////		acceptTwoIntegers(num1, num2);
//		
//	System.out.println("enter 4 digit number");
//		int number = sc.nextInt();
//		fourDigitNumber(number);
//		sc.close();
//	}
//	
//	
////	2 numbers' add,div ,mul ,sub
//    public static void	acceptTwoIntegers(int a, int b){	
//		System.out.println("addition : "+(a+b));
//		System.out.println("subtraction : "+Math.abs(a-b));
//		System.out.println("multiplication : "+(a*b));
//		int division = a > b? a/b :b/a;
//		System.out.println("division : "+division);
//		
//	}
//    
////    four digit number
//    public static void fourDigitNumber(int number) {
//    	String str = Integer.toString(number);
//    	if(str.length() !=  4) {
//    		System.out.println("invalid number");
//    		return;
//    	}
//    	System.out.println(str.charAt(0)+"000+"+str.charAt(1)+"00+"+str.charAt(2)+"0+"+str.charAt(3)+" = "+number);
//    	
//    	int sum = 0;
//    	while(number > 0) {
//    		sum += number%10;
//    		number = number/10;
//    	}
//    	System.out.println("addition of digits = " +sum);
//    	
//    	
//    }

//	scenario - 1
//	public static void main(String[] args) {
//		add();
//	}
//	public static void add() {
//		Scanner sc = new Scanner(System.in);
//	System.out.println("enter 2 numbers to be added");
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();
//	System.out.println(num1+num2);
//	}

// 	scenatio-2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 2 numbers to be subtracted");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		sub(num1, num2);
//	}
//	
//	public static void sub(int a, int b) {
//		System.out.println(Math.abs(a-b));
//	}
//	

// 	scenatio-3
//	public static void main(String[] args) {
//		System.out.println(mul());
//	}
//	
//	public static int mul() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 2 numbers to be multiplied");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		return num1*num2;
//	}

//	scenario-4

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 2 numbers for division");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(div(num1, num2));
//	}
//	
//	public static int div(int a, int b) {
//		return a > b? a/b :b/a;
//	}

//	swith case
//
//	1] 
//		add()
//		add()	
//		add()
//	2] 
//		main
//		sub()
//		sub()
//
//	3] 	
//		multi()
//		multi()
//		main
//
//	4] 	
//		main
//		div()
//		main
//	

// switch case scenario
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int choice;
//		char ch = 'y';
//		
//		do {
//
//			System.out.println("Enter your choice");
//			System.out.println("1. addition");
//			System.out.println("2. sutraction");
//			System.out.println("3. multiplication");
//			System.out.println("4. division");
//
//		    choice = sc.nextInt();
//
//			switch (choice) {
//			case 1:
//				add();
//				break;
//
//			case 2:
//				System.out.println("enter 2 numbers to be subtracted");
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				sub(a, b);
//				break;
//
//			case 3:
//				System.out.println(mul());
//				break;
//
//			case 4:
//				System.out.println("enter 2 numbers for division");
//				int num1 = sc.nextInt();
//				int num2 = sc.nextInt();
//				System.out.println(div(num1, num2));
//				break;
//
//			default:
//				System.out.println("invalid choice");
//				break;
//			}
//
//			System.out.println("do you want to continue y/n");
//			ch = sc.next().charAt(0);
//			
//			if(ch == 'n' || ch == 'N') {
//				System.out.println("Thankyou");
//			}else if(ch == 'y' || ch == 'Y') {
//				
//			}else {
//				System.out.println("invalid option");
//			}
//
//		} while (ch == 'y' || ch == 'Y');
//
//	}
//
//	public static void add() {
//		System.out.println("enter 2 numbers to be added");
//		sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(num1 + num2);
//	}
//
//	public static void sub(int a, int b) {
//		System.out.println(Math.abs(a - b));
//	}
//
//	public static int mul() {
//		System.out.println("enter 2 numbers to be multiplied");
//		sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		return num1 * num2;
//	}
//
//	public static int div(int a, int b) {
//		return a > b ? a / b : b / a;
//	}
// switch case scenario end
	
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println(n+"   "+str);
	}
	
	
	
	
	
}


