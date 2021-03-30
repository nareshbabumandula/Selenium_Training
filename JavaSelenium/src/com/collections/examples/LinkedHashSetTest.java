package com.collections.examples;

import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class LinkedHashSetTest {
	
	public void LinkedHashSetMethods() {
		
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("Naresh");
		lhs.add("Riya");
		lhs.add("Anjali");
		lhs.add("Ruken");
		lhs.add("Anjali");
		lhs.add("Deepshika");
		lhs.add("Sudheera");
		lhs.add(null);
		lhs.add("Ravi");
		
		lhs.forEach((n)->{System.out.println(n);});
		
		// Converting Set to Stream
	    Stream<String> stream = lhs.stream();
	    //System.out.println("First element is : " + stream.findFirst());
	    //System.out.println(stream.count());
	    //System.out.println(stream.findAny());
	      
	    // displaying elements of Stream using lambda expression
	    stream.forEach(elem->System.out.print(elem+" "));
	    		
		lhs.contains("Naresh");
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		
		
	}

	public static void main(String[] args) {
		
		LinkedHashSetTest lhst = new LinkedHashSetTest();
		lhst.LinkedHashSetMethods();

	}

}
