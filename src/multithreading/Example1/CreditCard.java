package multithreading.Example1;

public class CreditCard extends Thread {
	HDFC hdfc;
	public CreditCard(HDFC hdfc) {
		this.hdfc=hdfc;
	}
	@Override
	public void run() {
		hdfc.deposit(5000);
	}
}
