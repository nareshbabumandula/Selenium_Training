package lamda.test;

public class WithoutLambdaTest{

	public static void main(String[] args) {
		
		int Speed = 100;
		// without lambda, Car implementation using anonymous class
		
		// Anonymous class - A class which has no name is known as anonymous class. It should be used if we have to override
		Car c = new Car() 
		{
			public void Driving() {
				System.out.println("Driving car at a speed of  : " + Speed);
			}
		};
		
		c.Driving();
	}

}
