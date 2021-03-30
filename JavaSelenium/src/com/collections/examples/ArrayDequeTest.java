package com.collections.examples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class ArrayDequeTest {
	
	public void dequeMethods() {
		
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Anjali");
		dq.add("Madhu");
		dq.add("Ruken");
		dq.add("Uday");
		
		System.out.println(dq.isEmpty());
		System.out.println("Head is : " + dq.peek()); // Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty or returns null if this queue is empty.
		System.out.println(dq.element()); // Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception ifthis queue is empty. 
		System.out.println(dq.poll()); // Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println("Head after poll is : " + dq.peek());
		
		Iterator iter = dq.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Java Lambda Expression on forEachLoop
		dq.forEach((n)->{System.out.println(n);});
		
	}

	public static void main(String[] args) {
		
		ArrayDequeTest dqt = new ArrayDequeTest();
		dqt.dequeMethods();

	}

}
