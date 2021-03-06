package com.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		// Java is a statically typed programming language because it does type checking at compile time
		// Java expects its variables to declare before they can be assigned values
		// Java is a case sensitive language
		
		// Primitive Data Types in Java - byte (Byte), short(Short), int(Integer), long (Long), char (Char), float (Float), 
		//double (Double), boolean (Boolean)
		
		// JIT Compiler
		byte a=123;
		System.out.println("Byte value of a is : " + a);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short b=1314;
		System.out.println("Short value of b is : " + b);
		System.out.println(Short.MIN_VALUE); // Short Wrapper class 
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
		
		// Type Casting
		/*
		 * The process of converting data from one data type to another data type is as called as "Type Casting"
		 * There are two types of type casting exists in Java
		 * 1. Primitive data types Type Casting
		 * 2. User Defined Data Types Type Casting
		 * 
		 * Note: To perform user defined data types Type Casting we need either "extends" relation or "implements" relationship
		 * between user defined data types
		 * 
		 * 1. Primitive data types Type Casting
		 * 
		 * The process of converting one type of primitive data type to another type of primitive data type is called as Primitive
		 * data type type casting
		 * 
		 * 
		 * There are two types of primitive data type Type Casting
		 * 
		 * 1. Implicit (Widening) Type Casting : The process of converting data from lower data type to higher data type
		 * 2. Explicit (Narrowing) Type Casting : The process of converting higher data type to lower data type
		 * 		 * 
		 * Implicit Type Casting : byte -> short -> int -> long -> float -> double
		 * Explicit Type Casting : double -> float -> long -> -> int -> short -> byte
		 * 
		 * Type checking is the responsibility of compiler and Type Casting is the responsibility of JVM
		 */
		
		// Implicit or Widening or automatic type casting 
		
		
		byte a1 = 108;
		int b1 = a1; // Assigning lower data type variable to a higher data type variable
		System.out.println(b1);
		long c1 =b1; // Assigning lower data type variable to a higher data type variable
		System.out.println(c1);
		
		// Explicit or Narrowing type casting 
		int d1 = 130;
		byte e1 =(byte)d1; //  Assigning higher data type variable to a lower data type variable explicitly
		System.out.println(e1);
		
	}

}
