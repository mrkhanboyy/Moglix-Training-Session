package com.training.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;



public class CollectionExample {
	public static void main(String[] args) {
		System.out.println("using linked list");
		LinkedList<String> al = new LinkedList<String>();
		al.add("Anish");
		al.add("tanish");
		al.add("rupesh");
		al.add("Paresh");

		System.out.println(al);
		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("using vector");
		Vector<String> v=new Vector<String>();
		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("Four");
		
		Iterator<String> itr2=v.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("using stack");

	}
}
