package mazenetday7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program5 {

	public static void main(String[] args) {
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1,"Hyderabad");
		m1.put(2,"Mumbai");
		m1.put(3,"Bangalore");
		m1.put(4,"Chennai");
		m1.put(1,"Hyderabad");
		m1.put(2,"Mumbai");
		
		Set<Entry<Integer,String>>entryset=m1.entrySet();
		for (Entry<Integer,String> i : entryset) {
			System.out.println(i);
		}
		
		
	}

}
