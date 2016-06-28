package myPackage;

import java.math.BigDecimal;

public class Account {
	// Class variables
	String name;
	BigDecimal amount;
	// Constructor
	public Account(String accountName, String startAmount) {
		this.name = accountName;
		this.amount = new BigDecimal(startAmount);
		// Allow for two decimals
		this.amount.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
}
