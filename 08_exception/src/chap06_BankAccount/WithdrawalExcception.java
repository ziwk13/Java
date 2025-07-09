package chap06_BankAccount;

public class WithdrawalExcception extends Exception {

	private static final long serialVersionUID = 1L;

	public WithdrawalExcception(String message) {
		super(message);
	}
}
