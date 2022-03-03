package mazenetday7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=new ArrayList<>();
		str.add("chinni");
		str.add("shanmukha");
		str.add("sumanth");
		str.add("rakesh");
		str.add("virat");
		
	
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
	
	}

	}

}
