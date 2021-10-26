package coop_sync;

public class Bank {
	private int account = 0;
	
	public synchronized int extract() {
		while (account <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		account -= 1;
		notifyAll();
		return account;
	}
	
	public synchronized void deposit() {
		int deposited = 1;
		account += deposited;
		notify();
	}
	
	public void checkAccount() {
		System.out.println("The current value of the bank account is: " + account);
	}
	
}
