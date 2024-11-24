
public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	
	public SavingsAccount(String name, double initalAmount) {
		super(name, initalAmount);
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
 	}
	
	public void postInterest(){
		this.setBalance((this.getBalance()*(rate/12)) + this.getBalance());
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public SavingsAccount(SavingsAccount obj, double initalAmount) {
		super(obj ,initalAmount);
		this.savingsNumber = obj.savingsNumber+1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
}
