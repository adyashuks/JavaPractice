package patterns.Decorator.composite;

public class CompositeAccount extends Component{

	private float totalBalance;
	private AccountStatement individual, composite;
	
	@Override
	public float getBalance() {
		totalBalance = 0;
		for(Component c : list) {
			totalBalance += c.getBalance(); 
		}
		return totalBalance;
	}
	@Override
	public AccountStatement getStatement() {
		for(Component c : list) {
			individual = c.getStatement();
			composite.merge(individual);
		}
		return composite;
	}
	
	
}
