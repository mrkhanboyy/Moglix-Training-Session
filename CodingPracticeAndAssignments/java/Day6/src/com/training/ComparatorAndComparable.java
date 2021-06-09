package com.training;

import java.util.ArrayList;
import java.util.Iterator;

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student s1) {
		if (age == s1.age) {
			return 0;
		} else if (age < s1.age) {
			return 1;
		} else
			return -1;
	}

}

public class ComparatorAndComparable {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Tanish", 23);
		Student s2 = new Student(102, "Anish", 43);
		Student s3 = new Student(103, "Manish", 23);

		System.out.println("hello");
		
		if (s1.compareTo(s2) == 0) {
			System.out.println("Both are equal");
		} else if (s1.compareTo(s2) == -1) {
			System.out.println("s1 is less than s2");
		}

		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == (Integer)4) {
				list.set(i, "20");
			}
//			System.out.println(ob);
		}
		System.out.println(list);
		
	}

}
