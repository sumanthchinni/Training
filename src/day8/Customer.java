package day8;

import java.util.*;

public class Customer {
	private String name;
	private String address;
	private int age;
	private double balance;
	private List<Account> account;
	
	
	Customer(){
		
	}
	
	Customer(String name,String address,int age,double balance){
		this.name=name;
		this.address=address;
		this.age=age;
		this.balance=balance;
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
	

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public void getCustomerDetails() {
		System.out.println("Name : "+getName()+" Address : "+getAddress()+" Age : "+getAge()+
				" Balance : "+getBalance());
		
		Iterator<Account> itr=account.iterator();
		while(itr.hasNext()) {
			Account account=itr.next();
			System.out.println("Account number : "+account.getAccountNumber()+
					"  IFSC Code : "+account.getIfscCode());
			
		}
		}
	public void accountDetails() {
		
	}
}
