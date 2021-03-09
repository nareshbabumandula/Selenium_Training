package oops;

public class Arithmatic {
	
	// State or characteristics or data members
	int a=10;
	int b=20;
	
	// Behavior or action or functionality or method
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void subtraction() {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " + c);
	}
	
	// No argument constructor
	public Arithmatic() {
		System.out.println("I am a no argument constructor");
	}

	// Parameterized Constructor
	public Arithmatic(String USERNAME) {
		System.out.println("I am a parameterized constrcutor  with a parameter : " + USERNAME);
	}
	
	public static void main(String[] args) {
		
		Arithmatic arth = new Arithmatic();
		Arithmatic arth1 = new Arithmatic("Madhu");
		System.out.println(arth.a);
		System.out.println(arth.b);
		arth.addition();
		arth.subtraction();
		System.out.println(arth.toString());
		System.out.println(arth1.toString());
		
	}

}
