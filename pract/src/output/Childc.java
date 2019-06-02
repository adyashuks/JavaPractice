package output;

public class Childc extends Parentp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentp p = new Childc();
		p.show();
//		p.display();
	}
	public void show() {
		System.out.println("Child show method");
	}
	public void display() {
		System.out.println("Child display method");
	}

}
