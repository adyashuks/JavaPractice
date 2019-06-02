package patterns.Decorator.composite;

public class SavingsAccount extends Component {

	private String accountNo;
	private float accountBalance;

	private AccountStatement currentStmt;
	
	
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public SavingsAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
	}

	@Override
	public AccountStatement getStatement() {
		// TODO Auto-generated method stub
		return currentStmt;
	}

	public String getAccountNo() {
        return accountNo;
    }
	
}
