package com.access.modifiers;

public class PrivateTest {

	// private variables
	private String URL = "https://www.mycontactform.com/";
	private String USERNAME = "ruken";
	private String PASSWORD = "Ignore123";


	// private methods
	private void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}

	private void login() {
		System.out.println("Successfully logged into the application with user ID : " + USERNAME);
	}

	// private constructor
	private PrivateTest(){
		System.out.println("This is a private constructor..!");
	}


	public static void main(String[] args) {
		
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.login();

	}

}
