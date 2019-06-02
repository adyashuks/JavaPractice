package patterns.Decorator;

public class PhoneDecorator implements Phone {

	public Phone p;
	
	public PhoneDecorator(Phone phone) {
		this.p = phone;
	}

	@Override
	public void printPhone() {
		// TODO Auto-generated method stub
		this.p.printPhone();
	}

}
