package chap06_BankAccount;

public class DepositException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DepositException(String message) {
		super(message);
	}
}
