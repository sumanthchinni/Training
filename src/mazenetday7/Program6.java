package mazenetday7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program6
{
	
	static List<String> name=new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n;
		int ch=0;
		do {
			System.out.println("\nsel");
			System.out.println("*");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("*");
			ch=sc.nextInt();
			if(ch==4) {
				break;
			}
			else {
				switch(ch) {
				case 1:System.out.println("e n");
					   n=sc.next();
					   addName(n);
					   break;
				case 2:System.out.println("en");
					   n=sc.next();
					   searchName(n);
					   break;
				case 3:System.out.println( "\n*");
					   System.out.println("r");
					   System.out.println("*\n");
					   display();
					   
					   break;
				
				}
			}
			
		}while(ch!=4);

	}
	
	public static void addName(String n) {
		name.add(n);
	}
	
	public static void searchName(String n) {
		boolean srch=name.contains(n);
		if(srch) {
			System.out.println("*");
			System.out.println("s");
			System.out.println("*\n");
			System.out.println(n);
		}
	}
	
	public static void display() {
		Iterator<String> it=name.iterator();
		while(it.hasNext()) {
	
				System.out.println(it.next());
			
		}
		System.out.println("\n");
	}

}