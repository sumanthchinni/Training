package mazenetday5;

class Sbi implements Bank{
	String name;
	long accNo;
	double amount;
	Sbi(String name,long accNo,double amount){
		this.name=name;
		this.accNo=accNo;
		this.amount=amount;
		
	}
	@Override
	public double RateOfInterest(double RateOfInterest) {
		System.out.println("Name : "+name+"   accNo : "+accNo+"   amount : "+amount);
		System.out.println("Rate of Interest : "+RateOfInterest);
		System.out.println("Interest for one month is : "+(amount*RateOfInterest*1)/100);
		return RateOfInterest;
	}
public static void main(String[] args) {
		Bank bank;
		bank=new Sbi("sumanth",456782139,2500.00);
		bank.RateOfInterest(5);
		bank=new Sbi("chinni",254631897,40000.00);
		bank.RateOfInterest(10);
		
	}
}

