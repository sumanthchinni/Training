package day4;

public class Customer {
	
		private String name;
		private String address;
		private int age;
		private double balance;
		private Account account;
		private Address address1; 
		Customer(String name, String address,int age,double balance,Account account,Address address1 ){
			this.name=name;
			this.address=address;
			this.age=age;
			this.balance=balance;
			this.account=account;
			this.address1=address1;
		}
		
		Customer(){
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
		public Address getAddress1() {
			return address1;
		}
		public void setAddress1(Address address1) {
			this.address1 = address1;
		}
		
		public void getCustomerDetails() {
			System.out.println("Name : "+getName()+" Address : "+getAddress()+" Age : "+getAge()+
					" Balance : "+getBalance());
			}
		
		public void getCustomerDetailsAndAccountDetails() {
			System.out.println("Name : "+getName()+" Address : "+getAddress()+" Age : "+getAge()+
					" Balance : "+getBalance()+" Account number : "+getAccount().accountNumber+
					" IFSC Code: "+getAccount().ifscCode);
			}
		
		public String editAddress(String newAddress) {
			setAddress(newAddress);
			return "Address is changed";
			
		}
}


