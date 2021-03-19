package methods.types.examples;

public class ClassA {

	int a,b; // Instance variables

	public ClassA(int x, int y) {
		a = x;
		b = y;
	}
	
	boolean compare(ClassA o) {
		return (o.a==a&& o.b==b);
		
	}
		
}


