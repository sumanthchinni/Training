package day3;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter array size: ");
		int a=sc.nextInt();
		System.out.println("Enter Array elements: ");
		int[] array=new int[a];
		for ( i=0;i<a;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be found: ");
		int n=sc.nextInt();
		for ( i=0;i<a;i++) {
			if (array[i]==n) {
				System.out.println(n+" is found at location "+(i+1));
			}
		}
		if (i==a) {
				System.out.println("Number is not found");
			}
		}

	}

