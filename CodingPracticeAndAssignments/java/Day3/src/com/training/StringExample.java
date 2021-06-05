package com.training;

public class StringExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("HEllo");
		sb.append("String");
		
		System.out.println(sb);
		
		sb.insert(1, "NEW");
		System.out.println(sb);
		
		
		
		sb.replace(1,3," -JAVA- ");
		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);
		
	}
	
	
	
}
