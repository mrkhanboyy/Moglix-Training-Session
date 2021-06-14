package com.training.org;


public class Address {
	private int id;
	private String street;
	private String city;
	private String zipCode;
	
	
	public Address() {
		super();
	}


	public Address(String street, String city, String zipCode) {
		super();
		
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

	
	
}