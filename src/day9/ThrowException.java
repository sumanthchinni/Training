package day9;
import java.util.*;
public class ThrowException {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc=new Scanner(System.in);
			ThrowException t1=new ThrowException();
			System.out.println("Enter the age : \n");
			int age=sc.nextInt();
			t1.eligibility(age);
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
	public void eligibility(int age){
		if(age<18) {
			throw new InvalidAgeException("not eligible to vote"
					+ "");
		}
		else {
			System.out.println("welcome to vote");
		}
	}

}
