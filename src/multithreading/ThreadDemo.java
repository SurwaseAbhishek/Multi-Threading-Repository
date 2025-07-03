package multithreading;

public class ThreadDemo extends Thread{
	
	public ThreadDemo() {
		super();
	}
	
	public ThreadDemo(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("First Thread");
		ThreadDemo t2 = new ThreadDemo("Second Thread");
		t1.setName("first name ByMethod");
		t2.setName("second name ByMethod");
		t1.start();
		t2.start();
	}
	
	public void run() {
		System.out.println(this.currentThread());
		System.out.println("Hi from Abhi !!!");
		System.out.println("Hi from Akash !!! ");
	}
}
 