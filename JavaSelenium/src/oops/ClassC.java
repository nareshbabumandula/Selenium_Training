package oops;

public class ClassC extends ClassB{
	
	public void submitWebFeedback() {
		System.out.println("Successfully submitted web feedback..!");
	}
	
	public ClassC() {
		System.out.println("This is a constructor of ClassC");
	}

	

	public static void main(String[] args) {
		
		ClassC c = new ClassC();
		System.out.println(c.URL);
		System.out.println(c.USERNAME);
		System.out.println(c.PASSWORD);
		c.accessSite();
		c.login();
		c.submitSampleEmailandContactForm();
		c.submitWebFeedback();
		

	}

}
