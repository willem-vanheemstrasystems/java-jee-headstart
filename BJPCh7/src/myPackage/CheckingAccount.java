package myPackage;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
	// Variables
	private int numberOfSignatories = 0;
	private static final BigDecimal minimumBalance = new BigDecimal("100.00");
	// Constructor
	public CheckingAccount(String accountName, String startAmount, int numberOfSignatories) {
		super(accountName, startAmount);
		this.setNumberOfSignatories(numberOfSignatories);
	}	
	// Method
	public int getNumberOfSignatories(){
		return numberOfSignatories;
	}
	// Method
	public void setNumberOfSignatories(int numberOfSignatories){
		this.numberOfSignatories = numberOfSignatories;
	}	
	// Method overrides abstract method withdraw()
	@Override
	public void withdraw(String withdrawal) {
		BigDecimal desiredAmount = new BigDecimal(withdrawal);
		// If withdrawal would put the the balance below the minimum,
		// throw an exception 
		if(this.getAmount().compareTo(desiredAmount.add(minimumBalance)) < 0){
			throw new IllegalArgumentException();
		}
		else {
			super.withdraw(withdrawal);
		}
	}
	// Method overrides abstract method toString()
	@Override
	public String toString(){
		return "Checking Account " + super.toString();
	}
}
