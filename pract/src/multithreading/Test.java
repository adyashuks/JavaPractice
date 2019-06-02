package multithreading;

public class Test implements Runnable {
	public static void main(String[] args) {
		new Test();
		Test task = new Test();
		Thread t = new Thread(task);
		Thread t1 = new Thread(task);
		t.start();
		t1.start();
	}

	public Test() {
		
	}

	public void run() {
//		int i=10;
//		while(i> 0) {
			System.out.println("test");
//			i--;
//		}
	}
}
