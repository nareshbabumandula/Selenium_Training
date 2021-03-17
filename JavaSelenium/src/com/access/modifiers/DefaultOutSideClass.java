package com.access.modifiers;

public class DefaultOutSideClass {

	public static void main(String[] args) {
		System.out.println("Accessing default access modifier outside the class");
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.login();

	}

}
