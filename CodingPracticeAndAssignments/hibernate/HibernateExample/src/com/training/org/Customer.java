package com.training.org;

public class Customer {

	private int id;
	private String name;
	private double balance;
	private String onlineId;
	private String onlinepassword;
	private String contactNumber;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, double balance, String onlineId, String onlinepassword, String contactNumber,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.onlineId = onlineId;
		this.onlinepassword = onlinepassword;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOnlineId() {
		return onlineId;
	}
	public void setOnlineId(String onlineId) {
		this.onlineId = onlineId;
	}
	public String getOnlinepassword() {
		return onlinepassword;
	}
	public void setOnlinepassword(String onlinepassword) {
		this.onlinepassword = onlinepassword;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + ", onlineId=" + onlineId
				+ ", onlinepassword=" + onlinepassword + ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}
	
	
	
}
