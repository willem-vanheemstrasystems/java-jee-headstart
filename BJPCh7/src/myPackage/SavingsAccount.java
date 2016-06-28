package myPackage;

public class SavingsAccount extends Account {
	// Constructor
	public SavingsAccount(String accountName, String startAmount){
		super(accountName, startAmount);
		// Give a bonus of $10 when opening the account
		this.deposit("10.00");
	}
	// Method overrides abstract method toString()
	@Override
	public String toString(){
		return "Savings Account " + super.toString();
	}	
}
