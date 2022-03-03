package day8;
import java.util.*;


public class CustomerMain {

	public static void main(String[] args) {
		
		Customer cust2=new Customer("chini","madras",25,8523.00);
		Account acc1=new Account("fgj6779",7894);
		Account acc2=new Account("124hff",4578);
		List<Account> l1=new ArrayList<>();
		l1.add(acc1);
		l1.add(acc2);
		cust2.getCustomerDetails();

	}

}
