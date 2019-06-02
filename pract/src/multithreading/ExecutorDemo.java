package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ex.execute(new PrintChar('r', 1000));
		ex.execute(new PrintNum(500));
		
		ex.shutdown();
		System.out.println(ex.isTerminated());

	}

}
