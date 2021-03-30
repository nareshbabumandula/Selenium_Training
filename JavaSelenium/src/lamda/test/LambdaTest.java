package lamda.test;

public class LambdaTest {

	public static void main(String[] args) {
		int Speed =120;
		
		// With Lambda
		Car c = ()->{
			System.out.println("Driving car at a speed of  : " + Speed);
		};
		c.Driving();
	}
	

}
