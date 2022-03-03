package day4;

public class CustomerDriver {

	public static void main(String[] args) {
		Account acc=new Account("1234df",123456);
		Address add1=new Address("15 Yelhanka","23 Rajanakunte","Bangalore","Karnataka","560064");
		Customer cust1=new Customer();
		cust1.setName("sumanth");
		cust1.setAddress("1 mg road bangalore");
		cust1.setAge(21);
		cust1.setBalance(2400.22);
		cust1.setAccount(acc);
		cust1.setAddress1(add1);
		cust1.getCustomerDetails();
		cust1.getAccount().displayAccountDetails();
		cust1.getAddress1().getAddressDetails();
		
		
		Account acc1=new Account("fgj6779",7894);
		Address add2=new Address("15 Singanayakahalli","23 Hebbal","Bangalore","Karnataka","560064");
		Customer cust2=new Customer("chini","madras",25,8523.00,acc1,add2);
		cust2.getCustomerDetails();
		Account accobj=cust2.getAccount();
		accobj.displayAccountDetails();
		Address add=cust2.getAddress1();
		add.getAddressDetails();
		
		
		
		

		cust1.getCustomerDetailsAndAccountDetails();
		
		

	}

}
