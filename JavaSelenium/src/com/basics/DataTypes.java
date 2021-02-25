package com.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		// Java is a statically typed programming language because it does type checking at compile time
		// Java expects its variables to declare before they can be assigned values
		// Java is a case sensitive language
		
		// Primitive Data Types in Java - byte (Byte), short(Short), int(Integer), long (Long), char (Char), float (Float), 
		//double (Double), boolean (Boolean)
		
		// JIT Compiler
		byte a=127;
		System.out.println("Byte value of a is : " + a);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short b=1314;
		System.out.println("Short value of b is : " + b);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
				
		int c = 241445;
		System.out.println("Integer value of c is : " + c);
		
		long d = 2423423;
		System.out.println("Long value of d is : " + d);
		
		char e = 't';
		System.out.println("Char value of e is : " + e);
		
		float f = 12.5f;
		System.out.println("Float value of f is : " + f);
		
		double g = 234.46356457;
		System.out.println("Double value of g is : " + g);
		
		boolean h = true;
		System.out.println("Boolean value of h is : " + h);
		
		
	

	}

}
