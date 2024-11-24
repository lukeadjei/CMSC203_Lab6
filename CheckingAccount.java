
public class CheckingAccount extends BankAccount{

	private static final double FEE = 0.15;
	
	
	public CheckingAccount(String name, double initalAmount) {
		super(name, initalAmount);
		super.setAccountNumber(super.getAccountNumber()+"-"+"10");
	}
	
	
	@Override
	public boolean withdraw(double amount) {
		double temp = amount+this.FEE;
		if (super.withdraw(temp)) {
			return true;
		}
		return false;
	}
}
