package no_monitor;

public class Bank {
	private int account = 0;
	
	public int extract() {
		account -= 1;
		return account;
	}
	
	public void deposit() {
		int deposited = 1;
		account += deposited;
	}
	
	public void checkAccount() {
		System.out.println("The current value of the bank account is: " + account);
	}
	
}
