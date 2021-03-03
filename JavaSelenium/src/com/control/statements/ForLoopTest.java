package com.control.statements;

public class ForLoopTest {
	
	public void ForLoopExample() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration value is : " + i);
		}
		
	}
	
	public void testOddEvenNumbers() {
		
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				System.out.println(i + ": is an even number");
			}else {
				System.out.println(i + ": is an odd number");
			}
		}
		
	}	
	
	public void ForLoopReverseExample() {
		
		for (int i = 10; i >= 1; i--) {
			System.out.println("Iteration value is : " + i);
		}
		
	}
	
	public void ForLoopDoubleIncrementExample() {
		
		for (int i = 1; i < 10; i++) {
			System.out.println("Iteration value is : " + i);
			i++;
		}
		
	}
	
	public void ForLoopValidation() {
		
		for (int i=-10; i<=10; i++) {
			System.out.println("Iteration value is : " + i);
		}
		
	}

	public static void main(String[] args) {
		
		ForLoopTest flt = new ForLoopTest();
		//flt.ForLoopExample();
		//flt.testOddEvenNumbers();
		//flt.ForLoopReverseExample();
		//flt.ForLoopDoubleIncrementExample();
		flt.ForLoopValidation();
		

	}

}
