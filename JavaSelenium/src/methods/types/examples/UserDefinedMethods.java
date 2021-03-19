package methods.types.examples;

public class UserDefinedMethods {

	// Method without arguments and without any return value
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	// Method with arguments and without any return value
	public void subtraction(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}


	// Method without arguments and with return value
	public double multiplication() {
		int a=10;
		double b=12.3434;
		double c=a*b;
		return c;
	}

	// Method with arguments and with return value
	public int division(int a, int b) {
		int c=a/b;
		return c;
	}

	public String combineString(String sTextOne, String sTextTwo) {
		String res = sTextOne + " " + sTextTwo;
		return res;
	}

	public int[] marks() {
		int[] score = {10,40,60,90,70};
		return score;

	}

	// Method without arguments and without any return value
	public void modulus() {
		try {
			int a=10;
			int b=20;
			int c=b%a;
			System.out.println("Modulus of a and b is : " +c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		UserDefinedMethods udf = new UserDefinedMethods();
		udf.modulus();
		udf.addition();
		udf.subtraction(100, 50);
		double res = udf.multiplication();
		System.out.println("Output generated from multiplication method is : " + res);
		int res1 = udf.division(20, 10);
		System.out.println("Output generated from division method is : " + res1);
		String output = udf.combineString("Hello", "welcome to core java training");
		System.out.println(output);
		int[] arrRes = udf.marks();
		System.out.println(arrRes[0]);
		System.out.println(arrRes[1]);
	


	}

}
