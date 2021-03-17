package com.access.modifiers;

public class ProtectedTest {

	// protected variables
	protected String URL = "https://www.mycontactform.com/";
	protected String USERNAME = "ruken";
	protected String PASSWORD = "Ignore123";


	// protected methods
	protected void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}

	protected void login() {
		System.out.println("Successfully logged into the application with user ID : " + USERNAME);
	}

	// protected constructor
	protected ProtectedTest(){
		System.out.println("This is a protected constructor..!");
	}


	public static void main(String[] args) {
		
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.login();

	}

}
