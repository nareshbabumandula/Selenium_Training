package oops;

public class MethodOverridingTest extends MethodOverloadTest{
	
	//To achieve method overriding we must have two classes with a IS-A relationship and must have at least 1 identical method
	
	int a=20;
	int b=30;
	
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	public void Demo() {
		super.addition(); // Supress the overriding
		addition(); // subclass addition method call
		this.addition(); // subclass addition method call
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		MethodOverridingTest mot = new MethodOverridingTest();
		mot.addition();
		mot.Demo();
	}

}
