package multithreading;

public class PrintChar implements Runnable{

	private char charToPrint;
	private int times;
	
	public PrintChar(char charToPrint, int times) {
		super();
		this.charToPrint = charToPrint;
		this.times = times;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< times; i++) {
			System.out.println(charToPrint);
		}
	}

}
