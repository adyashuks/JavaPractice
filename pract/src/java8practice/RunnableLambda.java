package java8practice;

public class RunnableLambda {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside Runnable");
			}
		});
		t.run();
		
		//Lambda RUnnable
		
		Thread t1 = new Thread(()-> System.out.println("I am printing runnable through Lambda"));
		t1.run();
	}
}
