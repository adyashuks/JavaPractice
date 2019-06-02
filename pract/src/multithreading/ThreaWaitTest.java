package multithreading;

public class ThreaWaitTest extends Thread
{
	public static void main(String [] args) 
    {
		ThreaWaitTest t = new ThreaWaitTest();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run() 
    {
        System.out.print("Thread ");
    }
}