package day4;

public class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String pinCode;
	
	Address(String address1,String address2,String city,String state,String pinCode){
		this.address1=address1;
		this.address2=address2;
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
	}
	
	public void getAddressDetails() {
		System.out.println("Address 1 : "+address1+" Address 2 : "+address2+" City : "+city+"state : "+state+" Pincode : "+pinCode);
		
	}
	

}
