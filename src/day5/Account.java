package day5;

public class Account {
	
	long accNo;
    double balance;

	
	Account(){
		
	}
	Account(long accNo,double balance){
		this.accNo=accNo;
		this.balance=balance;
	}
	public long getAccNo() {
		return accNo;
	}


	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}


	public double getBalance() {
		return balance;
	}
	


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double deposit(double amount) {
		balance=balance+amount;
		return balance;
	}
	public double withDraw(double amount) {
		balance=balance-amount;
		return balance;
	}
	
	public void displayBalance() {
		System.out.println("Balance is : "+getBalance());
	}


public class SavingAccount extends Account{
	
	private double time;
	
	 SavingAccount(){
		 
	 }
	
	SavingAccount(long accNo,double balance,double time){
		super(accNo,balance);
		this.time=time;
		
	}
	public void calculateInterest() {
		displayBalance();
		System.out.println("Interest is : "+(this.balance*4*this.time)/100);
	}
}

public class CurrentAccount extends Account{
	
	private double time;
	
	CurrentAccount(long accNo,double balance,double time ){
		super(accNo,balance);
		this.time=time;
	}
	public void Interest() {
		displayBalance();
		
		System.out.println("Interest is : "+(balance*2*time)/100+"\n");
	}
}



}






