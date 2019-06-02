package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

	public static void main(String[] args) {

		ExecutorService es = Executors.newSingleThreadExecutor();
		Future res = es.submit(new CallableImpl(5));
	}

}
