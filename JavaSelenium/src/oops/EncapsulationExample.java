package oops;

public class EncapsulationExample {

	// Private data member or private variable
	private String USERNAME = "naresh";
	private String PASSWORD = "Secure*12";

	
	public String getUSERNAME() {
		return USERNAME;
	}


	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}


	public static void main(String[] args) {
		
		EncapsulationExample ee = new EncapsulationExample();
		System.out.println(ee.USERNAME);
		System.out.println(ee.PASSWORD);
		

	}

}
