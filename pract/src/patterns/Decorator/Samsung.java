package patterns.Decorator;

public class Samsung extends PhoneDecorator{

	public Samsung(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printPhone() {
		super.printPhone();
		System.out.println("This is Samsung phone");
	}
}
