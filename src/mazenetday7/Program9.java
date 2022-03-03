package mazenetday7;

import java.util.LinkedList;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("chinni");
		list.add("sai");
		System.out.println("Elements in the linked list : \n"+list);
		//adding the elements at specified location
		list.add(1,"Shanmukha");
		list.add(2,"Sumanth");
		System.out.println("After adding elements at specified location : \n"+list);
	
		

	}

}
