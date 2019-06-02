package multithreading;

public class PrintNum implements Runnable{

	int lastNum;
	
	public PrintNum(int lastNum) {
		super();
		this.lastNum = lastNum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < lastNum ; i++) {
			System.out.println(" " + i);
			Thread.yield();
		}
	}

}
