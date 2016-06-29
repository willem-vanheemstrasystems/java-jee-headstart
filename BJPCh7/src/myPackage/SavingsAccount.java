package myPackage;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
	// Constructor
	public SavingsAccount(String accountName, String startAmount) throws IllegalAccount, IllegalDeposit {
		// Call super class constructor
		super(superMethod(accountName, startAmount));
		// Give a bonus of $10 when opening the account
		try{
			this.deposit("10.00");
		} catch(IllegalDeposit id){
			throw new IllegalDeposit("Illegal Deposit");
		}
	}
	// Method
	private static String[] superMethod(String accountName, String startAmount) throws IllegalAccount {
		BigDecimal temp;
		try{
			temp = new BigDecimal(startAmount);
		} catch(Exception e){
			return new String[]{"",""};
		}
		if(temp.compareTo(BigDecimal.ZERO) > 0){
			return new String[]{accountName, startAmount};
		}		
		else{
			throw new IllegalAccount("Illegal Account");
		}
	}
	// Method overrides abstract method toString() of super class Account
	@Override
	public String toString(){
		return "Savings Account " + super.toString();
	}
	// Method implements abstract method isValidDeposit() of interface Accountable
	@Override
	public boolean isValidDeposit(String deposit) {
		BigDecimal temp;
		try{
			temp = new BigDecimal(deposit);
		} catch(Exception e){
			return false;
		}
		return temp.compareTo(BigDecimal.ZERO) > 0;
	}
	// Method implements abstract method isValidWithdrawal() of interface Accountable
	@Override
	public boolean isValidWithdrawal(String withdrawal) {
		BigDecimal temp;
		try {
			temp = new BigDecimal(withdrawal);
		} catch(Exception e){
			return false;
		}
		if(temp.compareTo(this.getAmount()) < 0) {
			return true;
		}
		return false;
	}	
}
