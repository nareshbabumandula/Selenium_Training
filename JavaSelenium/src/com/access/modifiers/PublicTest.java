package com.access.modifiers;

public class PublicTest {

	// public variables
	public String URL = "https://www.mycontactform.com/";
	public String USERNAME = "ruken";
	public String PASSWORD = "Ignore123";


	// public methods
	public void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}

	public void login() {
		System.out.println("Successfully logged into the application with user ID : " + USERNAME);
	}

	// public constructor
	public PublicTest(){
		System.out.println("This is a public constructor..!");
	}


	public static void main(String[] args) {
		
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		pt.accessSite();
		System.out.println(pt.PASSWORD);
		pt.login();

	}

}
