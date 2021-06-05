package com.training.org;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		Invoice invoice1 = new Invoice();
//		invoice1.showInvoicedetails();
//		System.out.println("invoice1 total : "+invoice1.getTotal());
//		
//		System.out.println("enter invoice id");
//		int id = sc.nextInt();
//		sc.nextLine();
//		System.out.println("enter invoice description");
//		String desc = sc.nextLine();
//		System.out.println("enter quantity");
//	    int quantity =sc.nextInt();
//	    System.out.println("enter per unit price");
//		int unitPrice = sc.nextInt();
//		
//		
//		Invoice invoice2 = new Invoice(id, desc, quantity, unitPrice);
//		invoice2.showInvoicedetails();
//		System.out.println("invoice2 total : "+invoice2.getTotal());
//	}
//	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		Book book1 = new Book();
//		book1.showBookDetails();
//		System.out.println();
//		System.out.println("enter book name");
//		String name = sc.nextLine();
//		System.out.println("enter book author");
//		String author = sc.nextLine();
//		System.out.println("enter quantity");
//	    int price =sc.nextInt();
//	    System.out.println("enter per unit price");
//		int quantity = sc.nextInt();
//		
//		Book book2 = new Book(name, author, price, quantity);
//		book2.showBookDetails();
//	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Book> booksList = new ArrayList<Book>();
		
		for(int i=65; i<=80; i++) {
			booksList.add(new Book("Book"+i, "author"+(char)(i), (int)(Math.random()*100), (int)(Math.random()*20)));
		}
	
		
		for(int i=0; i<booksList.size(); i++) {
            booksList.get(i).showBookDetails();
            System.out.println();
		}
		
		
	}
}
