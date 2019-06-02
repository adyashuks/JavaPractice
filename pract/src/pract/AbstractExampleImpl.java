package pract;

public class AbstractExampleImpl extends AbstractExample {
String s2;
	public AbstractExampleImpl(String s) {
		super(s);
		// TODO Auto-generated constructor stub
		this.s2 = s;
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a3() {
		System.out.println("Hello Impl");
	}
	
	public static void main(String[] args) {
		AbstractExampleImpl abs = new AbstractExampleImpl("ADya");
		System.out.println(abs.s);
		abs.a1();
		abs.a2();
		abs.a3();
	}
}
