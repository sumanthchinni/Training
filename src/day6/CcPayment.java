package day6;

public  class CcPayment extends Payment {
	
	CcPayment(String name,String address){
		super(name,address);
	}

	@Override
	void doPayment(double amount) {
		System.out.println("Credit card payment is :  "+amount);
		displayDetails();
		
	}

}
