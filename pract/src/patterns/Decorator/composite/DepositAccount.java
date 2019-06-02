package patterns.Decorator.composite;

public class DepositAccount extends Component{

	private String accountNo;
	private float accountBalance;

	private AccountStatement currentStmt;
	
	
	public DepositAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public DepositAccount(String accountNo, float accountBalance) {
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
