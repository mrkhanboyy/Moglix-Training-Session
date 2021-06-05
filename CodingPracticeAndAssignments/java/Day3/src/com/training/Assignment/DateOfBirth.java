package com.training.Assignment;

public class DateOfBirth {

	private int day;
	private int mont;
	private int year;
	
	
	
	public DateOfBirth(int day, int mont, int year) {
		super();
		this.day = day;
		this.mont = mont;
		this.year = year;
	}



	@Override
	public String toString() {
		return "DateOfBirth [day=" + day + ", mont=" + mont + ", year=" + year + "]";
	}
	
	
}
