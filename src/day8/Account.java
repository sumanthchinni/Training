package day8;

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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

}
