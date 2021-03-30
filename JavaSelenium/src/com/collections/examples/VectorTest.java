package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	public void vectorMethods() {
		
		Vector<String> vec = new Vector<>();
		Vector<String> vec1 = new Vector<>();
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ravi");
				
		vec.add("Madhu");
		vec.add("Ruken");
		vec.add("Anjveci");
		vec.add("Naresh");
		vec.add("Uday");
		System.out.println(vec.isEmpty());
		System.out.println(vec.contains("Naresh"));
		System.out.println(vec.get(0));
		System.out.println(vec.indexOf("Uday"));
		System.out.println(vec.remove("Ruken"));
		vec.add("Riya");
		vec.add("Anjveci");
		vec.add(null);
		System.out.println(vec.size());
		vec1.add("Rajesh");
		vec1.add("Bveca");
		vec1.add("Nishanth");
		vec.addAll(vec1); // Merge 2 collections
		vec.addAll(al);
		System.out.println("Length of the Vector collection is : " + vec.capacity());
		System.out.println("First element is : " + vec.firstElement());
		System.out.println("Last element is : " + vec.lastElement());
		vec.insertElementAt("Kranthi", 1);
		
		
		for (String string : vec) {
			System.out.println("Element found is : " +string);
		}
		
		for (Iterator iterator = vec.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}
		
		// Traverse arrvecist via Iterator
		Iterator iter = vec.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		VectorTest vect = new VectorTest();
		vect.vectorMethods();
	}

}
