package multithreading.Example1;

public class Main {
	public static void main(String[] args) {
		HDFC hdfc = new HDFC(7000);
		CreditCard credit = new CreditCard(hdfc);
		credit.setName("Credit card Thread");	
		DebitCard debit = new DebitCard(hdfc);
		debit.setName("Debit Card Thread");
		debit.start();	
		credit.start();
		hdfc.remainingBalance();
	}
	
}
