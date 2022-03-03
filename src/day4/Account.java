package day4;

public class Account {

	String accountNumber;
	int ifscCode;
	Account(String accountNumber,int ifscCode){
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
	}
		
	public void displayAccountDetails() {
		System.out.println("Account number : "+accountNumber+" IFSC Code : "+ifscCode);

	}

	

}
