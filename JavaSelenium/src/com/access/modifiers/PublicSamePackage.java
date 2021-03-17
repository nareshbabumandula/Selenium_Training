package com.access.modifiers;

public class PublicSamePackage {

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		pt.accessSite();
		System.out.println(pt.PASSWORD);
		pt.login();
	}

}
