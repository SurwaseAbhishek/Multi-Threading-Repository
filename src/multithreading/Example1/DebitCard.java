package multithreading.Example1;

public class DebitCard extends Thread{
	private HDFC hdfc;
	public DebitCard(HDFC hdfc) {
		this.hdfc=hdfc;
	}
	
	@Override
	public void run() {
		hdfc.withdraw(3000);
	}
}
