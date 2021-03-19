package exception.demo;

public class UncheckedException {
	
	public void division() {
		boolean bFlag = false;
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			bFlag = true;
		} catch (Exception e) {
			System.out.println("Failed to divide since the b value is 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			if (bFlag) {
				System.out.println("Successfully performed the division");
			} else {
				System.out.println("Failed to perform division");
			}
		}
	}
	
	public void test() {
		
		try {
			// Array of elements
			int marks[] = {40,50,70,85,55};
			System.out.println(marks[0]);
			System.out.println(marks[5]);
			System.out.println(marks[1]);
			System.out.println(marks[2]);
			System.out.println(marks[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void nullpointerException() {
		
		try {
			String s=null;  
			System.out.println(s.length());//NullPointerException 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void numberformatException() {
		
		try {
			String s="abc";  
			int i=Integer.parseInt(s);//NumberFormatException  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		UncheckedException uce = new UncheckedException();
		uce.division();
		//uce.test();
		//uce.nullpointerException();
		//uce.numberformatException();
	}

}
