package com.access.modifiers;

public class DefaultTest {

	// default variables
	 String URL = "https://www.mycontactform.com/";
	 String USERNAME = "ruken";
	 String PASSWORD = "Ignore123";


	// default methods
	void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}

	void login() {
		System.out.println("Successfully logged into the application with user ID : " + USERNAME);
	}

	// default constructor
	DefaultTest(){
		System.out.println("This is a  packaged constructor..!");
	}


	public static void main(String[] args) {
		
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.login();

	}

}
