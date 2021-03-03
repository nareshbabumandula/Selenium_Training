package com.control.statements;

public class ForEachLoop {
	
	public void forEachExample() {
		
		String[] names = {"Madhu", "Ravi","Shilpa", "Ruken", "Naresh"};
		
		System.out.println("Length of the names array is : " + names.length);
		
		for (String person : names) {
			System.out.println(person);
		}
		
	}

	public static void main(String[] args) {
		ForEachLoop fel = new ForEachLoop();
		fel.forEachExample();

	}

}
