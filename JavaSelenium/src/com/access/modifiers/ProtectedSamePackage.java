package com.access.modifiers;

public class ProtectedSamePackage {

	public static void main(String[] args) {
		System.out.println("Accessing protected members within the same package..!");
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.login();

	}

}
