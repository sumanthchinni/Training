package day5;

public class AccountMain {

	public static void main(String[] args) {
		Account acc1=new Account(1235879,2500.0);
		acc1.deposit(1500);
		acc1.displayBalance();
		acc1=SavingAccount(12345678,500.0,2.0);
		acc1.calculateInterest();
		
		
	}

	private static Account SavingAccount(int i, double d, double e) {
		// TODO Auto-generated method stub
		return null;
	}

}
