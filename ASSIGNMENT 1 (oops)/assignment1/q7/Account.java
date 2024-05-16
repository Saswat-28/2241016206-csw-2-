package assignment1.q7;

public abstract class Account {
	private int accountNumber;
	protected double balance;
	
	public Account(int ac,double b) {
		this.accountNumber=ac;
		this.balance=b;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
}
