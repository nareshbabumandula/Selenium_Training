package oops;

public class ClassA {
	
	// Data members
	String USERNAME="Madhu";
	String PASSWORD="Secure*1234";
	String URL ="https://www.mycontactform.com";
	
	// static block
	static {
		System.out.println("This a static block of ClassA");
	}
	
	// Instance block
	{
		System.out.println("This a instance block of ClassA");
	}
	
	public void accessSite(){
		System.out.println("Accessed the site : " + URL);
	}

	public void login(){
		System.out.println("Successfully logged into mycontactform application with the user : " + USERNAME);
	}
	
	// Constructor
	public ClassA() {
		System.out.println("This is a constructor of ClassA");
	}

	
	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		System.out.println(obj.USERNAME);
		System.out.println(obj.PASSWORD);
		System.out.println(obj.URL);
		
		obj.accessSite();
		obj.login();

	}

}
