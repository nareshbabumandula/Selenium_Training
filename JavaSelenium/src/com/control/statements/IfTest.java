package com.control.statements;


public class IfTest {

	// Method body or logic or implementation details
	int a=5;
	int b=10;


	public void enhancedIf() {
		if (a<b) System.out.println("a is less than b");
	}

	// Method (Block of code) or Behavior or functionality
	public void IfExample() {
		if (a>b) {
			System.out.println("a is greater than b");
		}
	}

	public void IfElseExample() {
		if (a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("a is less than b");
		}
	}

	public void IfElseIfElseExample() {
		if (a>b) {
			System.out.println("a is greater than b");
		}else if(a==b){
			System.out.println("a and b are equal");
		}else {
			System.out.println("a is less than b");
		}
	}

	// No argument explicit constructor
	public IfTest() {
		System.out.println("This is a constructor");
	}


	public static void main(String[] args) {
		// Create an object reference for a class
		// Syntax : Classname objRefName = new Constructor();
		IfTest it = new IfTest();
		System.out.println(it.hashCode()); // Memory Address
		System.out.println(it.a);
		System.out.println(it.b);
		//it.IfExample();
		//it.IfElseExample();
		it.IfElseIfElseExample();
		it.enhancedIf();


	}

}
