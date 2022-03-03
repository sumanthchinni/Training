package day6;

public abstract class Payment {
	private String name;
	private String address;
	
	Payment(){
	}
	
	Payment(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+name+" Address : "+address+"\n");
	}
	
	abstract void doPayment(double amount);
}
