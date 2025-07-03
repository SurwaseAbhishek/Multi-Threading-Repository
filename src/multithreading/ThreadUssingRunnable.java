package multithreading;

public class ThreadUssingRunnable implements Runnable {

	@Override
	public void run() {
			System.out.println("Hi From Abhishke");		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadUssingRunnable());
		Thread t2 = new Thread(new ThreadUssingRunnable());

		t1.start();
		t2.start();
	}

}
