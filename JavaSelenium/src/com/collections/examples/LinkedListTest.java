package com.collections.examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	
	public void LinkedListMethods() {
		
		LinkedList<String> ll = new LinkedList<>();
		LinkedList<String> llist = new LinkedList<>();
				
		ll.add("Madhu");
		ll.add("Ruken");
		ll.add("Anjali");
		ll.add("Naresh");
		ll.add("Uday");
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("Naresh"));
		System.out.println(ll.get(0));
		System.out.println(ll.indexOf("Uday"));
		System.out.println(ll.remove("Ruken"));
		System.out.println("Retrieving the 1st element of the list using peek method : " + ll.peek());
		System.out.println(ll.poll());
		ll.add("Riya");
		ll.add("Anjali");
		ll.add(null);
		System.out.println(ll.size());
		llist.add("Rajesh");
		llist.add("Bala");
		llist.add("Nishanth");
		ll.addAll(llist); // Add two LinkedList collections

		
		for (String string : ll) {
			System.out.println("Element found is : " +string);
		}
		
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}
		
		// Traverse arrllist via Iterator
		Iterator iter = ll.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		LinkedListTest llt = new LinkedListTest();
		llt.LinkedListMethods();
	}

}
