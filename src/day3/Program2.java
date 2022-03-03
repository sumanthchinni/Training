package day3;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("The prime Numbers are :");
		for (int i=2;i<n;i++) {
			int k=0;
			for (int j=2;j<i;j++) {
				if (i%j==0) {
					k=1;
				}
			}
			if (k==0) {
				System.out.println(i);
				}
		}

		}
}
	

