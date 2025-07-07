package multithreading.threadpoolconcept;

public class SendMailsInsurenecSystem implements Runnable {
	Customer custObject;

	public SendMailsInsurenecSystem(Customer custObject) {
		this.custObject = custObject;
	}

	@Override
	public void run() {
		sentMail(custObject);
	}

	public void sentMail(Customer custObject) {
		StringBuffer str = new StringBuffer();
		str.append("Hey Hi " + custObject.getCutsomerName());
		str.append(custObject.getCustomerRefNo() + " : This is your Policy no");
		str.append("Please ensure that your AMOUNt " + custObject.getPremiumAmount() + " will due on comming dat");
	}
}