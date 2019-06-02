package multithreading;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer>{
	private int number;
	public CallableImpl(int number) {
		super();
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return fact(number);
	}

	public static int fact(int n) {
		int f=1;
		for(int i=2; i<= n; i++) {
			f=f*i;
		}
		System.out.println("Factorial = "+ f);
		return f;
	}
}
