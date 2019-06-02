package patterns.Decorator;

public class DecoratorMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test 1");
		Phone phone = new BasicNokia();
		phone.printPhone();
		System.out.println("test 2");
		Phone phone1 = new Motorola(phone);
		phone1.printPhone();
		System.out.println("test 3");
		Phone phone2 = new Samsung(phone1);
		phone2.printPhone();
	}
}
