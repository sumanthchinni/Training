package day7;
import java.util.*;
public class Set1 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("S");
		s.add("G");
		s.add("K");
		s.add("P");
		s.add("Y");
		
		for(String str : s) {
			System.out.println(str);
		}
		
		Iterator<String> itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Set Element : "+itr.next());
		}
		}

}
