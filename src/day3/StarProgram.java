package day3;
import java.util.*;
public class StarProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, j, k;       
		k=sc.nextInt();
		for (i=0; i<k; i++)   
		{  
			for (j=k-i; j>1; j--)   
			{   
				System.out.print(" ");   
			}   
			for (j=0; j<=i; j++ )   
			{        
				System.out.print("* ");   
			}   
			System.out.println();   
		}   

	}

}
