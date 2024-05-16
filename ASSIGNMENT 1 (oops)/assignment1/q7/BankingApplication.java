package assignment1.q7;

public class BankingApplication {

	public static void main(String[] args) {
		Account S1=new SavingsAccount(100,1000.0,5.0);
		Account C1=new CurrentAccount(200,500.0,200.0);
		
		S1.deposit(500.0);
		S1.withdraw(200.0);
		
		C1.deposit(300.0);
		C1.withdraw(700.0);
		
		displayAccountDetails(S1);
		displayAccountDetails(C1);
		
	}
	public static void displayAccountDetails(Account account) {
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Balance: "+account.getBalance());
		System.out.println();
	}

}
