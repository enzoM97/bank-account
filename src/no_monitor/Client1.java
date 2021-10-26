package no_monitor;

public class Client1 extends Thread {
	
	private Bank _bank;
	
	public Client1(Bank bank) {
		_bank = bank;
	}
	
	@Override
	public void run() {
		while (true) {
			_bank.deposit();
			System.out.println("Client 2 made a deposit");
			_bank.checkAccount();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
