package pract;

public abstract class AbstractExample {
protected String s;
	public AbstractExample(String s) {
	super();
	this.s = s;
}
	public abstract void a1();
	public abstract void a2();
	public void a3() {
		System.out.println("Not abstract");
	}
	
}
