package com.collections.examples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	public void priorityQueueMethods() {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Anjali");
		pq.add("Madhu");
		pq.add("Ruken");
		pq.add("Uday");
		
		System.out.println(pq.isEmpty());
		System.out.println("Head is : " + pq.peek()); // Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty or returns null if this queue is empty.
		System.out.println(pq.element()); // Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception ifthis queue is empty. 
		System.out.println(pq.poll()); // Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println("Head after poll is : " + pq.peek());
		
		Iterator iter = pq.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Java Lambda Expression on forEachLoop
		pq.forEach((n)->{System.out.println(n);});
		
		
		
		
	}

	public static void main(String[] args) {
		
		PriorityQueueTest pqt = new PriorityQueueTest();
		pqt.priorityQueueMethods();

	}

}
