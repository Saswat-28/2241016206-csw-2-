package assignment1.q7;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	
	public CurrentAccount(int accountNumber,double balance,double overdraftLimit) {
		super(accountNumber,balance);
		this.overdraftLimit=overdraftLimit;
	}
@Override
public void deposit(double amount) {
	balance=balance+amount;
}
@Override
public void withdraw(double amount) {
	if(balance-amount>=-overdraftLimit) {
		balance-=amount;
	}
	else {
		System.out.println("Overdraft Limit exceeded.");
	}
}
}
