package multithreading.Example1;

public class HDFC {
	private double balance;
	public HDFC(double intialBalnace) {
		this.balance=intialBalnace;
	}
	
	public synchronized void withdraw(double withdrawAmount) {
//		System.out.println("After debit");
		this.balance=balance-withdrawAmount;
	}
	
	public synchronized void deposit(double depositAmount) {
//		System.out.println("After credit");
		this.balance=balance+depositAmount;
	}
	
	public void remainingBalance() {
		System.out.println("Amount remaining in Account :: "+balance);
	}
}
