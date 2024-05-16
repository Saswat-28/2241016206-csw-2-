package assignment1.q7;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(int accountNumber,double balance,double ir) {
		super(accountNumber,balance);
		this.interestRate=ir;
	}
@Override
public void deposit(double amount) {
	balance+=amount+(amount*interestRate);
}
@Override
public void withdraw(double amount) {
	if(balance>=amount) {
		balance=balance-amount;
	}
	else {
		System.out.println("Insufficient balance.");
	}
}
}
