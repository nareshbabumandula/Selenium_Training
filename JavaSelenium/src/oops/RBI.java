package oops;

public interface RBI {
	
	abstract void AccountTypes();
	abstract void MinBalance();
	abstract void MaxBalance();
	abstract void MinWithdrawlfromATM();
	abstract void MaxWithDrawlfromATM();
	abstract void MinDeposit();
	abstract void MaxDeposit();
	abstract void KYC();
	
	public static void personalloan() {
		System.out.println("Personal loan facility is available");
	}
	
	public default void homeLoan() {
		System.out.println("Home loan facility is available");
	
	}
	
	public static void main(String[] args) {
		// RBI rb = new RBI(); // We cannot instantiate or create an instance for an Interface
		personalloan(); // static method
		
	}
	
}
