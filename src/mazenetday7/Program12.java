package mazenetday7;

import java.util.*;

import java.util.Map.Entry;

public class Program12 {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Hyderabad");
		m1.put(2, "Viajyawada");
		m1.put(3, "Mumbai");
		m1.put(4, "Chennai");
		m1.put(5, "Bangalore");

		System.out.println("---------------Before sorting the value------------");
		Set<Entry<Integer, String>> entryset = m1.entrySet();
		for (Entry<Integer, String> i : entryset) {
			System.out.println("Key : " + i.getKey() + "   Value : " + i.getValue());
		}
		
		ArrayList<String> l1=new ArrayList<>();
		for (Entry<Integer, String> i : entryset) {
			l1.add(i.getValue());
		}
		
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
		Collections.sort(l1);
		 for (String num : l1) {
	            for (Entry<Integer, String> entry : m1.entrySet()) {
	                if (entry.getValue().equals(num)) {
	                    sortedMap.put(entry.getKey(),num);
	                }
	            }
	        }
		 System.out.println("---------------After sorting the value------------");
			Set<Entry<Integer, String>> entryset1 = sortedMap.entrySet();
			for (Entry<Integer, String> i : entryset1) {
				System.out.println("Key : " + i.getKey() + "   Value : " + i.getValue());
			}
			
	}

}
