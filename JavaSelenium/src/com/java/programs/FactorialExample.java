package com.java.programs;

class FactorialExample{ 
	
	public void findFactorial(int num) {
		int i,fact=1;  
 		for(i=1;i<=num;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+num+" is: "+fact);    
	}
	
	public static void main(String args[]){ 
		
		FactorialExample fe = new FactorialExample();
		fe.findFactorial(5);
		
	}  
} 
