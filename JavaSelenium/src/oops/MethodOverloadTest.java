package oops;

public class MethodOverloadTest {

	
	//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	
	int a=10;
	int b=20;

	// public - access modifier
	// void - return type : It returns nothing
	// addition - method name
	// {method body}
	// Concrete Java method
	// empty () - no arguments/parameters
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of integer a and b is : " + c);
	}

	public void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of integer a, b and c is : " + d);
	}

	public void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition of double a and b is : " + c);
	}
	
	MethodOverloadTest(){
		System.out.println("This is no argument constructor");
	}
	
	MethodOverloadTest(int a){
		System.out.println("This is single integer constructor");
	}

	MethodOverloadTest(int a, int b){
		System.out.println("This is 2 integer constructor");
	}
	
	
	public static void main(String[] args) {

		MethodOverloadTest mot = new MethodOverloadTest(10);
		mot.addition(10, 20, 30);

	}
	
	

}
