package day5;

public class Rectangle extends Shape {
	
	Rectangle(int length,int breadth){
		super(length,breadth);
		
	}
	
	public void rectangleArea() {
		displayDetails();
		System.out.println("Area of Reactangle is : "+(this.length*this.breadth)+"\n");
	}
	
	public void rectanglePerimeter() {
		displayDetails();
		System.out.println("Perimeter of Reactangle is : "+(2*(this.length+this.breadth))+"\n");
	}

}
