package day5;

public class Parent {
	int i;
	Parent(int i){
		this.i=i;
	}
	public void displayData() {
		System.out.println("value of i is : "+i);
	}

}
class Child extends Parent{

	Child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	
	
}