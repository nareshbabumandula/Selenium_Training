package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackTest {
	
	public void StackMethods() {
		
		Stack<String> st = new Stack<>();
		Stack<String> st1 = new Stack<>();
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ravi");
				
		st.add("Madhu");
		st.add("Ruken");
		st.add("Anjveci");
		st.add("Naresh");
		st.add("Uday");
		System.out.println(st.isEmpty());
		System.out.println(st.contains("Naresh"));
		System.out.println(st.get(0));
		System.out.println(st.indexOf("Uday"));
		System.out.println(st.remove("Ruken"));
		st.add("Riya");
		st.add("Anjveci");
		st.add(null);
		System.out.println(st.size());
		st1.add("Rajesh");
		st1.add("Bveca");
		st1.add("Nishanth");
		st.addAll(st1); // Merge 2 collections
		st.addAll(al);
		System.out.println("Length of the Stack collection is : " + st.capacity());
		System.out.println("First element is : " + st.firstElement());
		System.out.println("Last element is : " + st.lastElement());
		st.insertElementAt("Kranthi", 1);
		
		System.out.println("---------------------------------------------");
		
		// Stack Additional methods
		st.push("Shravan"); // Pushes an item onto the top of this stack.
		System.out.println("First element after pushing : " + st.firstElement());
		System.out.println("Last element after pushing : " + st.lastElement());
		st.pop(); // Removes the object at the top of this stack
		System.out.println("Last element after pop : " + st.lastElement());
		
		for (String string : st) {
			System.out.println("Element found is : " +string);
		}
		
		for (Iterator iterator = st.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}
		
		// Traverse arrvecist via Iterator
		Iterator iter = st.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		StackTest stack = new StackTest();
		stack.StackMethods();
	}

}
