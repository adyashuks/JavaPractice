package patterns.Decorator.composite;

public class Main {

	public static void main(String[] args) {
		
		Component c = new CompositeAccount();
		c.add(new DepositAccount("AccDepo1", 100));
		c.add(new DepositAccount("AccDepo2", 100));
		c.add(new DepositAccount("AccDepo3", 100));
		c.add(new SavingsAccount("Save1", 200));
		c.add(new SavingsAccount("Save2", 200));
		c.add(new SavingsAccount("Save3", 200));
		
		float totalBalanc = c.getBalance();
		System.out.println("TOtal = " + totalBalanc);
	}
}
