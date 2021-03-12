package oops;

public class ICICI implements RBI {

	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		ic.AccountTypes();
		ic.MaxBalance();
		ic.MinBalance();
		ic.MinDeposit();
		ic.MaxDeposit();
		ic.KYC();
		ic.MinWithdrawlfromATM();
		ic.MaxWithDrawlfromATM();
		ic.homeLoan();

	}

	@Override
	public void AccountTypes() {
		System.out.println("Account types such as savings, personal, current are available");
		
	}

	@Override
	public void MinBalance() {
		System.out.println("Minimum balance should be 1000 per month should be maintained");
		
	}

	@Override
	public void MaxBalance() {
		System.out.println("MaxBalance should be 1000000 per account");
		
	}

	@Override
	public void MinWithdrawlfromATM() {
		System.out.println("Minimum withdrawl from an ATM is 100 rupees");
		
	}

	@Override
	public void MaxWithDrawlfromATM() {
		System.out.println("Maximum withdrawl from an ATM is 50000 rupees");
		
	}

	@Override
	public void MinDeposit() {
		System.out.println("Minimum deposit should be 500 rupees");
		
	}

	@Override
	public void MaxDeposit() {
		System.out.println("Max deposit should be 1 crore");
		
	}

	@Override
	public void KYC() {
		System.out.println("KYC should be done before opening an account");
		
	}

}
