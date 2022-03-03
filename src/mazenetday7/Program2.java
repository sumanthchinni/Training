package mazenetday7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(25);
		l1.add(58);
		l1.add(87);
		l1.add(15);
		l1.add(21);
		l1.add(14);
		
		Collections.reverse(l1);
		System.out.println("---------Reversed Elements---------");
		System.out.println(l1);
		
	}

}
