package day6;

public class NetBanking extends Payment{
	NetBanking(String name,String address){
		super(name,address);
	}


	@Override
	void doPayment(double amount) {
		System.out.println("NetBanking payment is :  "+amount);
		displayDetails();
		
	}

}
