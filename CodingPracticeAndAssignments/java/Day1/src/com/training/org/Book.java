package com.training.org;

public class Book {

	private String name;
	private String author;
	private int price;
	private int quantity;
	
	public Book() {
		System.out.println("defalt constructor called");
	}
	
	
	public Book(String name, String author, int price, int quantity) {
//		System.out.println("parameterized constructor called");
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public void showBookDetails() {
		System.out.println("name : "+name);
		System.out.println("author : "+author);
		System.out.println("price : "+price);
		System.out.println("quantity : "+quantity);
	}
	
	
	
}
