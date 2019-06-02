package multithreading;

public class TaskThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1 = new PrintChar('a', 10);
		Runnable r2 = new PrintChar('b', 10);
		Runnable r3 = new PrintChar('c', 10);
		Runnable r4 = new PrintNum(10);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t2.yield();
		try {
			t4.join();
		} catch(InterruptedException e) {
			
		}		
		
	}

}
