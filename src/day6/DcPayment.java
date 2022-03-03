package day6;

public class DcPayment implements Payment1 {
	String name;
	String address;
	DcPayment(String name,String address){
		this.name=name;
		this.address=address;
		
	}

	@Override
	public double payment(double amount) {
		System.out.println("Name : "+name+"    Address : "+address);
		System.out.println("Amount : "+amount);
		return amount;
	}
	
	public static void main(String[] args) {
		Payment1 pay;
		pay=new DcPayment("suman","bangalore");
		pay.payment(5203.0);
		
	}
	
	

}
