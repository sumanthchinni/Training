package day5;

public class Shape {
	int length;
	int breadth;
	 Shape(){
		 
	 }
	 Shape(int length, int breadth){
		 this.length=length;
		 this.breadth=breadth;
		 
	 }
	 
	 public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void displayDetails() {
		 System.out.println("length is : "+length);
		 System.out.println("Breadth is : "+breadth);
	 }
}
