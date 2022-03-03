package day5;

public class Program1 {
	static final int a;
	static int b;
	 static {
		 System.out.println("Static block");
		 a=10;
		 b=a*10;
		 System.out.println("Values of a and b are "+a+" "+ b);
		 
	 }

	public static void main(String[] args) {
		System.out.println("Main method");
		
		
	}

}
