package myPackage;

import java.math.BigDecimal;

public abstract class Account {
	// Class variables
	private String name;
	private BigDecimal amount;
	// Constructor
	public Account(String accountName, String startAmount) {
		setName(accountName);
		setAmount(startAmount);
		// Allow for two decimals
		this.amount.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("Account Created: " + this.getName());
	}
	// Method
	public String getName(){
		return this.name;
	}
	// Method
	public BigDecimal getAmount(){
		return this.amount;
	}
	// Method
	public void setName(String newName){
		// Only letters and numbers without any symbols 
		String pattern = "^[a-zA-Z0-9]*$";
		if(newName.matches(pattern)){
			this.name = newName;
		}
	}
	// Method
	public void setAmount(String newAmount){
		this.amount = new BigDecimal(newAmount);
	}
	// Method
	public void withdraw(String withdrawal) throws IllegalArgumentException {
		BigDecimal desiredAmount = new BigDecimal(withdrawal);
		// If desired amount is negative, throw an exception
		if(desiredAmount.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException();
		}
		// If the amount is less than the desired amount, throw an exception
		if(this.getAmount().compareTo(desiredAmount) < 0) {
			throw new IllegalArgumentException();	
		}
		this.setAmount(this.getAmount().subtract(desiredAmount).toString());
		System.out.println("Withdrawal: " + this);
	}
	// Method
	public void deposit(String deposit) throws IllegalArgumentException {
		BigDecimal desiredAmount = new BigDecimal(deposit);
		// If desired amount is negative, throw an exception 
		if(desiredAmount.compareTo(BigDecimal.ZERO) < 0){
			throw new IllegalArgumentException();			
		}
		this.setAmount(this.getAmount().add(desiredAmount).toString());
		System.out.println("Deposit: " + this);
	}
	// Method override
	@Override
	public String toString(){
		return this.getName() + ": Balance = " + this.getAmount();
	}
}
