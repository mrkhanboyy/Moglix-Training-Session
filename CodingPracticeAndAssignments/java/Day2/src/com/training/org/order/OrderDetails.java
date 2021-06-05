package com.training.org.order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderDetails {
	
	private String custName;
	private String custAddress;
	private ArrayList<Item> custProducts;
	private double billAmount;
	
	


	public OrderDetails() {
		System.out.println("Default constructor is called");
		custName="";
		custAddress="";
		custProducts=new ArrayList<Item>();
		billAmount=0;
	}

	public OrderDetails(String custName, String custAddress, ArrayList<Item> custProducts) {
		this.custName = custName;
		this.custAddress = custAddress;
		this.custProducts = custProducts;
		this.billAmount =0;
	}

	
	public void generateBillAmount() {
		double finalAmount = 0 ;
		for(Item item : custProducts) {
			finalAmount +=  item.getPrice(); 
		}
		billAmount = finalAmount;
	}

	@Override
	public String toString() {
		return
				"\ncustomer Name = "+custName+
				"\ncustomer Address = "+custAddress+
				"\nitems\n "+custProducts+
				"\n\norder total = "+billAmount
				;
	}

	public static void main(String[] args) {
	
		ArrayList<Item> availableItmes = new ArrayList<Item>();
		availableItmes.add(new Item("Milk", 50.0));
		availableItmes.add(new Item("Butter", 20.0));
		availableItmes.add(new Item("Curd", 25.0));
		availableItmes.add(new Item("Oil", 80.0));
		availableItmes.add(new Item("Sauce", 10.0));
		availableItmes.add(new Item("PeanutButter", 90.0));
		
		
		
		System.out.println("welcome to shop");
		System.out.println("choose corresponding option to the product");
		System.out.println("     name          price");
		for(int i=0; i<availableItmes.size(); i++) {
			System.out.println(i+"  "+availableItmes.get(i).getName()+"       "+availableItmes.get(i).getPrice());
		}
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Item> orderItems = new ArrayList<Item>();
		char ch = 'Y';
		
		
		
		do {
			System.out.println("enter product option");
			int code = Integer.parseInt(sc.nextLine());
			orderItems.add(availableItmes.get(code));
			
			System.out.println("do you want to continue shopping y/n?");
			ch = sc.nextLine().charAt(0);
			if(ch == 'n' || ch == 'N' ) {
				break;
			}
			
		}while(ch == 'Y' || ch == 'y');
		
		
		System.out.println("enter your name");
		String customerName = sc.nextLine();
		
		System.out.println("enter address");
		String custAddress = sc.nextLine();
		sc.close();
		OrderDetails   o1 = new OrderDetails(customerName, custAddress, orderItems);
		o1.generateBillAmount();
		
		System.out.println("\nOrder placed Successfully ");
		
		System.out.println("Order details are below  : ");
		System.out.println(o1);
		
		
		
		
		
	
		
		
		

	}

}
