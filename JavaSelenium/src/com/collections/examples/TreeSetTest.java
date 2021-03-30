package com.collections.examples;

import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetTest {
	
	public void TreeSetMethods() {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Naresh");
		ts.add("Riya");
		ts.add("Anjali");
		ts.add("Ruken");
		ts.add("Anjali");
		ts.add("Deepshika");
		ts.add("Sudheera");
		//ts.add(null);
		ts.add("Teja");
			
		ts.forEach((n)->{System.out.println(n);});
		
		// Converting Set to Stream
	    Stream<String> stream = ts.stream();
	    //System.out.println("First element is : " + stream.findFirst());
	    //System.out.println(stream.count());
	    //System.out.println(stream.findAny());
	      
	    // displaying elements of Stream using lambda expression
	    stream.forEach(elem->System.out.print(elem+" "));
	    		
	    ts.contains("Naresh");
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		
		
	}

	public static void main(String[] args) {
		
		TreeSetTest ts = new TreeSetTest();
		ts.TreeSetMethods();

	}

}
