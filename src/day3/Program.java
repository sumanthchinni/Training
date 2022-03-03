package day3;
import java.util.*;
public class Program {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	String num=sc.next();
	switch(num) {
	case "+": System.out.println("Addition of array is : "+(num1+num2));
	        break;
	case "-": 
    		System.out.println("subtraction of array is : "+(num1-num2));
    		break;
	case "*": 
    		System.out.println("Multiplication of array is : "+(num1*num2));
    		break;
	case "/": 
    		System.out.println("Division of array is : "+(num1/num2));
    		break;
	}
	
	}
	

}


