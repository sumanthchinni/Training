package day6;

public class PaymentMain {

	public static void main(String[] args) {
		
		Payment p1=new CcPayment("rakesh","bangalore");
		p1.doPayment(250.35);
	
		
		Payment p2=new CcPayment("sai","Ongole");
		p2.doPayment(5000.00);
		
		
		
	}

}
