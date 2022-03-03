package mazenetday4;


public abstract class Bank {
	Bank(){
	}
	abstract void getRateOfInterest(double ROI);
	public static void main(String[] args) {
		Bank bank;
		bank=new SBI();
		bank.getRateOfInterest(5.75);
		bank=new Icici();
		bank.getRateOfInterest(7.95);
		bank=new Axis();
		bank.getRateOfInterest(8.5);
	}
}

class SBI extends Bank{
	SBI(){
	}
	@Override
	void getRateOfInterest(double ROI) {
		System.out.println("Rate of interest for SBI bank is : "+ROI+"%");
	}
	
}
class Icici extends Bank{
	Icici(){
	}
	@Override
	void getRateOfInterest(double ROI) {
		System.out.println("Rate of interest for ICICI bank is : "+ROI+"%");
	}
	
}

class Axis extends Bank{
	Axis(){
	}
	@Override
	void getRateOfInterest(double ROI) {
		System.out.println("Rate of interest for Axis bank is : "+ROI+"%");
	}
	
}
