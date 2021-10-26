package monitor;

public class Bank {
	private int account = 0;
	
	public synchronized int extract() {
		account -= 1;
		return account;
	}
	
	public synchronized void deposit() {
		int deposited = 1;
		account += deposited;
	}
	
	public void checkAccount() {
		System.out.println("The current value of the bank account is: " + account);
	}
	
}
