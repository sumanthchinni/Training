package day9;
import java.util.*;
public class Exception {

	public static void main(String[] args) {
		Scanner sc;
		try {
		    sc=new Scanner(System.in);
			System.out.println("enter first number  : ");
			int a=sc.nextInt();
			System.out.println("enter second number  : ");
			int b=sc.nextInt();
		
			int c= a/b;
			System.out.println("After division : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("problem in code---  "+e.getMessage());
		}
		
		System.out.println("After Exception"
				+ "");
		
	}

}
