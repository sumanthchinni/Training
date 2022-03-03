package day5;

public class Cuboid extends Shape {
	int height;
	
	Cuboid(int length,int breadth,int height){
		 super(length,breadth);
		 this.height=height;
	}
	
	public void cuboidArea() {
		displayDetails();
		System.out.println("Height is : "+this.height);
		System.out.println("Area of cuboid is : "+this.length*this.breadth*this.height+"\n");
	}
}
