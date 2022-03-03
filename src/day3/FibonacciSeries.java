package day3;
import java.util.*;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println("The fibonaccci series are : ");
		if (num==1) {
			System.out.println(n1);
		}
		else if (num==2) {
			System.out.println(n1+" "+n2);
		}
		else {
			System.out.print(n1+" "+n2+" ");
			for (int i=2;i<num;i++) {
				n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
		}
	}

}
