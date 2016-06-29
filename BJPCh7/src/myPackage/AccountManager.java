package myPackage;

public class AccountManager {
	// Method main
	public static void main(String[] args) throws IllegalAccount, IllegalWithdrawal, IllegalDeposit {
		// Variables
		Accountable savingsAccount, checkingAccount;
		// Try to create a savings account
		try{
			// Polymorphism: Accountable -> SavingsAccount
			savingsAccount = new SavingsAccount("FirstSavingsAccount", "110.00");
		}catch(Exception e){
			//System.out.println("Illegal Account");
			throw new IllegalAccount("Illegal Account");		
		}
		// Try to withdraw from the savings account
		try{
			savingsAccount.withdraw("5.00");
		}catch(IllegalWithdrawal iw){
			//System.out.println("Illegal Withdrawal");
			throw new IllegalWithdrawal("Illegal Withdrawal");
		}
		// Try to create a checking account
		try{
			// Polymorphism: Accountable -> CheckingAccount
			checkingAccount = new CheckingAccount("FirstCheckingAccount", "110.00", 1);
		}catch(IllegalAccount ia){
			//System.out.println("Illegal Account");
			throw new IllegalAccount("Illegal Account");
		}
		// Try to withdraw from the checking account
		try{
			checkingAccount.withdraw("5.00");
		}catch(IllegalWithdrawal iw){
			//System.out.println("Invalid Withdrawal");
			throw new IllegalWithdrawal("Illegal Withdrawal");
		}
		// Try to deposit to the checking account
		try{
			checkingAccount.deposit("500.00");
		}catch(IllegalDeposit id){
			//System.out.println("Invalid Deposit");
			throw new IllegalWithdrawal("Illegal Deposit");
		}
		// Try to withdraw from the checking account
		try{
			checkingAccount.withdraw("5.00");
		}catch(IllegalWithdrawal iw){
			//System.out.println("Invalid Withdrawal");
			throw new IllegalWithdrawal("Illegal Withdrawal");
		}		
	}
}
