package com.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.control.statements.ForEachLoop;

public class ArrayListTest {
	
	public void ArrayListMethods() {
		
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> alist = new ArrayList<>();
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(30);
		al1.add(20);
		al1.add(80);
		al1.add(49);
		Collections.sort(al1);
		System.out.println(al1.get(0));
		
		al1.forEach((i)->{System.out.println(i);});
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		List<String> list3 = new Vector();
		List<String> list4 = new Stack();
				
		al.add("Madhu");
		al.add("Ruken");
		al.add("Anjali");
		al.add("Naresh");
		al.add("Uday");
	
		Collections.sort(al); // Sorting

		System.out.println(al.isEmpty());
		System.out.println(al.contains("Naresh"));
		System.out.println(al.get(0));
		System.out.println(al.indexOf("Uday"));
		System.out.println(al.remove("Ruken"));
		al.add("Riya");
		al.add("Anjali");
		al.add(null);
		System.out.println(al.size());
		alist.add("Rajesh");
		alist.add("Bala");
		alist.add("Nishanth");
		al.addAll(alist); // Add two arraylist collections
	
		for (String string : al) {
			System.out.println("Element found is : " +string);
		}
		
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}
		
		// Traverse arralist via Iterator
		Iterator iter = al.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Iterating ArrayList using lambda expression
		System.out.println("Iterating ArrayList using lambda expression");
		al.forEach((n)->{System.out.println(n);});
	}
	
	
	public static void main(String[] args) {
		ArrayListTest alt = new ArrayListTest();
		alt.ArrayListMethods();
	}

}
