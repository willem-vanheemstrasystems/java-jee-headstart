package myPackage;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
	// Variables
	private int numberOfSignatories = 0;
	private static final BigDecimal minimumBalance = new BigDecimal("100.00");
	// Constructor
	public CheckingAccount(String accountName, String startAmount, int numberOfSignatories) throws IllegalAccount {
		// Call super class constructor
		super(accountName, startAmount);
		if(isValidDeposit(startAmount)) {
			this.setNumberOfSignatories(numberOfSignatories);
		}
		else {
			throw new IllegalAccount("Illegal Account");
		}
	}
	// Method
	public int getNumberOfSignatories(){
		return numberOfSignatories;
	}
	// Method
	public void setNumberOfSignatories(int numberOfSignatories){
		this.numberOfSignatories = numberOfSignatories;
	}	
	// Method overrides abstract method withdraw() of super class Account
	@Override
	public void withdraw(String withdrawal) throws IllegalWithdrawal {
		BigDecimal desiredAmount = new BigDecimal(withdrawal);
		// If withdrawal would put the the balance below the minimum,
		// throw an exception 
		if(this.getAmount().compareTo(desiredAmount.add(minimumBalance)) < 0){
			throw new IllegalWithdrawal("Illegal Withdrawal");
		}
		else {
			super.withdraw(withdrawal);
		}
	}
	// Method overrides abstract method toString() of super class Account
	@Override
	public String toString(){
		return "Checking Account " + super.toString();
	}
	// Method implements abstract method isValidWithdrawal() of interface Accountable
	@Override
	public boolean isValidWithdrawal(String withdrawal) {
		BigDecimal temp;
		try{
			temp = new BigDecimal(withdrawal);
		}catch(Exception e) {
			return false;
		}
		if(temp.compareTo(this.getAmount().add(minimumBalance)) < 0){
			return true;
		}
		return false;
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
		if(temp.compareTo(BigDecimal.ZERO) > 0) {
			if(temp.add(this.getAmount()).compareTo(minimumBalance) > 0){
				return true;
			}
		}
		return false;
	}
}
