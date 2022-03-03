package day4;



//Hands on day4
public class Account {
	private long account_no;
	private String name;
	private String email;
	private float amount;
	
	
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public void getAccountdetails() {
		System.out.println("Account Number : "+getAccount_no()+"\nName : "+getName()+
				"\nEmail : "+getEmail()+"\nAmount : "+getAmount());

	}

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccount_no(589632147);
		a1.setName("sumanth");
		a1.setEmail("sumanth@gmail.com");
		a1.setAmount(1500);
		a1.getAccountdetails();
	}
}


