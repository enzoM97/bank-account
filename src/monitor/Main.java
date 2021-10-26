package monitor;

public class Main {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		Client1 client1 = new Client1(b);
		Client2 client2 = new Client2(b);
		
		client1.start();
		client2.start();
		
	}

}
