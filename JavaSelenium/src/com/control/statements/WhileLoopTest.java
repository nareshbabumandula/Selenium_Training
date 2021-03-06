package com.control.statements;

public class WhileLoopTest {
	
	// While loop example
	public void whileLoopExample() {
		
		int i=1;
		
		while (i<=10) {
			System.out.println("Iteration value is : " + i);
			i++;
		}
	}
	

	public static void main(String[] args) {
		
		WhileLoopTest wlt = new WhileLoopTest();
		wlt.whileLoopExample();
		
	}

}
