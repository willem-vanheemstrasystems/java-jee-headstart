package myPackage;
/**
 * An interface to manage accounting behavior
 */
public interface Accountable {
	// Method
	/**
	 * Returns true if a specified String is a valid amount to deposit.
	 * @param deposit: the amount to be deposited
	 */
	boolean isValidDeposit(String deposit);
	// Method
	/**
	 * Adds the specified amount to the balance.
	 * @param deposit: the amount to be deposited
	 * @throws IllegalDeposit
	 */
	void deposit(String deposit) throws IllegalDeposit;
	// Method
	/**
	 * Returns true if a specified String is a valid amount to withdraw.
	 * @param withdrawal: the amount to be withdrawn
	 */
	boolean isValidWithdrawal(String withdrawal);
	// Method
	/**
	 * Subtracts the specified amount from the balance.
	 * @param withdrawal: the amount to be withdrawn
	 * @throws IllegalWithdrawal
	 */
	void withdraw(String withdrawal) throws IllegalWithdrawal;
}
