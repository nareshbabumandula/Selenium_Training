package com.basics;

public class VariablesTest {
	
	
	int d = 100; // Instance variable
	int e = 150;
	
	static int g = 200; // static variable or global variable
	
	public void Addition() {
		int a=10; // Local variables - Scope is within the method in which they have been declared
		int b=20;
		int c = a+b;
		System.out.println("Addition of a and b is : " +c);
		System.out.println(g);
	}
	
	public void subtraction() {
		int f = e-d;
		System.out.println(f);
	}

	public static void main(String[] args) {
		
		VariablesTest vt = new VariablesTest();
		vt.Addition();
		vt.subtraction();
		
		System.out.println(vt.d);
		System.out.println(vt.e);
		System.out.println(g);
	}

}
