package coop_sync;

public class Client2 extends Thread {
	private Bank _bank;
	
	public Client2(Bank bank) {
		_bank = bank;
	}
	
	@Override
	public void run() {
		while (true) {
			_bank.extract();
			System.out.println("Client 1 made an extraction");
			_bank.checkAccount();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
