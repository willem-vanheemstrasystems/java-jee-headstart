package myPackage;

import java.math.BigDecimal;

public class AccountManager {
	// Method main
	public static void main(String[] args) {
		// Variables
		Account account = new Account("FirstAccount", "10.00");
		System.out.println("Account Created: " + account.getName());
		System.out.println("Balance: " + account.getAmount());
		try{
			account.withdraw("20.00");
		}catch(IllegalArgumentException iae){
			System.out.println("Invalid Withdrawal");
		}finally{
			System.out.println("New Balance: " + account.getAmount());
		}
	}
}
