package mazenetday7;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(23);
		l1.add(15);
		l1.add(85);
		l1.add(62);
		l1.add(21);
		System.out.println("Enter the elemnt to be found :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(l1.contains(a)) {
			System.out.println(a+" is found in the list");
		}
		else {
			System.out.println(a+" is not found in the list");
		}
		
		}

	}


