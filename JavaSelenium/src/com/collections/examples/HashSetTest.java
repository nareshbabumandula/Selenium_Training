package com.collections.examples;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class HashSetTest {
	
	public void HashSetMethods() {
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Naresh");
		hs.add("Riya");
		hs.add("Anjali");
		hs.add("Ruken");
		hs.add("Anjali");
		hs.add("Deepshika");
		hs.add("Sudheera");
		hs.add(null);
		hs.add("Teja");
			
		hs.forEach((n)->{System.out.println(n);});
		
		// Converting Set to Stream
	    Stream<String> stream = hs.stream();
	    //System.out.println("First element is : " + stream.findFirst());
	    //System.out.println(stream.count());
	    //System.out.println(stream.findAny());
	      
	    // displaying elements of Stream using lambda expression
	    stream.forEach(elem->System.out.print(elem+" "));
	    		
		hs.contains("Naresh");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
	}

	public static void main(String[] args) {
		
		HashSetTest hst = new HashSetTest();
		hst.HashSetMethods();

	}

}
