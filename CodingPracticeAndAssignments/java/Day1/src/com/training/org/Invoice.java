package com.training.org;

public class Invoice {

	private int id;
	private String desc;
	private int quantity;
	private int unitPrice;
	
	public Invoice() {
		System.out.println("default constructor is called");
		id = 0;
		desc = "default description";
		quantity = 0;
		unitPrice = 0;
	}
	
	public Invoice(int id, String desc, int quantity, int unitPrice) {
		System.out.println("parameterized constructor called");
		this.id = id;
		this.desc = desc;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public int getTotal() {
		return quantity*unitPrice;
	}
	
	public void showInvoicedetails() {
		System.out.println("id : "+id);
		System.out.println("description : "+desc);
		System.out.println("quantity : "+quantity);
		System.out.println("unitprice : "+unitPrice);
	}
}

