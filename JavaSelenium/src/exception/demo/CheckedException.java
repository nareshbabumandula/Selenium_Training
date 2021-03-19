package exception.demo;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	
	public void CheckedExceptionwithThrowsExample() throws IOException {
		FileReader fr = new FileReader(".\\Files\\Data.txt");
		
		int i;
		while((i=fr.read())!=-1)
			System.out.println((char)i);
			
		fr.close(); // Close the file
	
	}
	
	
	public void CheckedExceptionwithTryCatchBlockExample() {
		//try block
		try {
			FileReader fr = new FileReader(".\\Files\\Data123.txt");
			int i;
			while((i=fr.read())!=-1)
				System.out.println((char)i);
				
			fr.close(); // Close the file
		} catch (Exception e) { // catch block
			System.out.println("Executing catch block..!");
			System.out.println(e.getMessage());
		}
	
	}
	
	

	public static void main(String[] args) throws IOException {
		CheckedException ce = new CheckedException();
		//ce.CheckedExceptionwithThrowsExample();
		ce.CheckedExceptionwithTryCatchBlockExample();
	}

}
