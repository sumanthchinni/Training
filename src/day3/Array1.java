package day3;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. of elements to store\n");
		int n = sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter array elements\n");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are\n");
		for (int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
			
	}

}
