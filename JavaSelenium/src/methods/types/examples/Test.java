package methods.types.examples;

public class Test {

	public static void main(String[] args) {
		
		ClassA obj1 = new ClassA(10, 20);
		ClassA obj2 = new ClassA(10, 20);
		
		System.out.println("obj1 == obj2 : " + obj1.compare(obj2));

	}

}
