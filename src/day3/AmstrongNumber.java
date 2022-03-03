package day3;
import java.util.*;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,temp,digits=0;
		double sum=0;
		temp=n;
		while ( temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		for (int i=0;i<digits;i++) {
			a=temp%10;
			sum=sum+(Math.pow(a,digits));
			temp=temp/10;
			
		}
		if (sum==n) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("not Amstrong number");
		}
	}

}
