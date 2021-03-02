package com.basics;

public class StringManipulations {

	public static void main(String[] args) {

		String sText1 = "hello";
		String sText2 = "WORLD";
		String sText3 = "welcome to core java training";
		String sText4 = "                   Selenium Training            ";
			
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText1 + " " + sText2);
		System.out.println(sText1.concat(" ").concat(sText2));
		System.out.println(sText3.length());
		System.out.println(sText1.charAt(0));
		System.out.println(sText2.indexOf('W'));
		System.out.println(sText3.contains("java"));
		System.out.println(sText1.equals("hello"));
		System.out.println(sText1.equalsIgnoreCase("HELLO"));
		System.out.println(sText3.startsWith("welcome"));
		System.out.println(sText3.endsWith("training"));
		System.out.println(sText3.replaceAll("training", "online training"));
		System.out.println(sText1.isEmpty());
		System.out.println(sText2.isBlank());
		System.out.println(sText3.subSequence(0, 4));
		System.out.println(sText3.substring(0, 10));
	
		String[] asText = sText3.split(" ");
		System.out.println("Length of the array asText is : " + asText.length);
		
		System.out.println(asText[0]);
		System.out.println(asText[1]);
		System.out.println(asText[2]);
		System.out.println(asText[3]);
		System.out.println(asText[4]);
		
		System.out.println(sText3.join(">", asText));
		
		for (int i = 0; i < sText3.length(); i++) {
			System.out.println(sText3.charAt(i));
		}
		
		System.out.println(sText4);
		System.out.println(sText4.trim());
		char[] arrChar = sText1.toCharArray();
		System.out.println(arrChar[0]);
		System.out.println((int)arrChar[0]);
		System.out.println((int)arrChar[1]);
		System.out.println((int)arrChar[2]);
		
		
	}

}
