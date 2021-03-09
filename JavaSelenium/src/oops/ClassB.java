package oops;

public class ClassB extends ClassA{
	
	public void submitSampleEmailandContactForm() {
		System.out.println("Successfully submitted Email and Contact form");
	}

	public ClassB() {
		System.out.println("This is a constructor of ClassB");
	}

	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.accessSite();
		b.login();
		b.submitSampleEmailandContactForm();
		System.out.println(b.URL);
		System.out.println(b.USERNAME);
		System.out.println(b.PASSWORD);
	}

}
