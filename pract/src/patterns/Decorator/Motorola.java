package patterns.Decorator;

public class Motorola extends PhoneDecorator{

	public Motorola(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printPhone() {
		super.printPhone();
		System.out.println("This is Moto phone");
	}
	

}
