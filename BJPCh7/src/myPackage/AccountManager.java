package myPackage;

public class AccountManager {
	// Method main
	public static void main(String[] args) {
		// Variables
		// Polymorphism
		Account savingsAccount = new SavingsAccount("FirstSavingsAccount", "10.00");
		try{
			savingsAccount.withdraw("5.00");
		}catch(IllegalArgumentException iae){
			System.out.println("Invalid Withdrawal");
		}
		// Polymorphism
		Account checkingAccount = new CheckingAccount("FirstCheckingAccount", "10.00", 1);
		try{
			checkingAccount.withdraw("5.00");
		}catch(IllegalArgumentException iae){
			System.out.println("Invalid Withdrawal");
		}
		checkingAccount.deposit("500.00");
		try{
			checkingAccount.withdraw("5.00");
		}catch(IllegalArgumentException iae){
			System.out.println("Invalid Withdrawal");
		}		
	}
}
