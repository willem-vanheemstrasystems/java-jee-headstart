package myPackage;

import java.math.BigDecimal;

public class AccountManager {

	public static void main(String[] args) {
		// Variables
		Account account = new Account("FirstAccount", "10.00");
		System.out.println("Account Created: " + account.name);
		System.out.println("Balance: " + account.amount);
		account.amount = new BigDecimal("-15.00");
		System.out.println("New Balance: " + account.amount);
	}

}
