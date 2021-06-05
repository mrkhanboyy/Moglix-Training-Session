package com.training.wrapperclass;

public class WrapperClassExample {
	
	public static void xyz(Integer a) {
		a=a*100;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("removal")
		Integer a=new Integer(100);
		
		System.out.println("value of x is "+a);
		xyz(a);
		System.out.println("value of x is "+a);
		
        
        
        }
    }