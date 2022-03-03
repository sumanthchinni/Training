
package mazenetday7;

import java.util.HashSet;
import java.util.Set;

public class Program10 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("Apple");
		set1.add("Mango");
		set1.add("banana");
		set1.add("Grapes");
		System.out.println("--------------Set 1 elements------------ ");
		System.out.println(set1);

		Set<String> set2 = new HashSet<>();
		set2.add("Pine Apple");
		set2.add("orange");
		set2.add("Mango");
		set2.add("Apple");
		System.out.println("--------------Set 2 Elments---------------- ");
		System.out.println(set2);

		System.out.println("----------Same elements on both  sets------");
		set1.retainAll(set2);
		System.out.println(set1);

	}

}
