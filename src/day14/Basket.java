package day14;

import java.util.List;
import java.util.OptionalInt;

public class Basket {
	private long manufactureNo;
	private int qty;
	
	Basket(long manufactureNo,int qty){
		this.manufactureNo=manufactureNo;
		this.qty=qty;
	}
	
	public long getManufactureNo() {
		return manufactureNo;
	}
	public void setManufactureNo(long manufactureNo) {
		this.manufactureNo = manufactureNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(getManufactureNo()).append(" ");
		sb.append(getQty());
		return sb.toString();
		
	}
	
	

}
