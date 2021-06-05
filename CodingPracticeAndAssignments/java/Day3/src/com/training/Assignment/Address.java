package com.training.Assignment;

public class Address {
	
	private String city;
	private String pincode;
	
	public Address(String city, String pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	

}
