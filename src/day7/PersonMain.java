package day7;
import java.util.*;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person(1,"sumanth",21);
		Person p2=new Person(2,"chinni",15);
		Person p3=new Person(3,"shanmukha",35);
		
		Map<Integer,Person> m1=new HashMap<>();
		m1.put(p1.getId(), p1);
		m1.put(p2.getId(), p2);
		m1.put(p3.getId(), p3);
		
		
		PersonMain a=new PersonMain();
		a.eligible(m1);
	}
	private void eligible(Map<Integer, Person> m1) {
		List<String> E=new ArrayList<>();
		List<String> NE=new ArrayList<>();
		
		for(int i : m1.keySet()) {
			if(m1.get(i).getAge()>18) {
				E.add(m1.get(i).getName());
			}
			else {
				NE.add(m1.get(i).getName());
			}
		}
		Iterator<String> e=E.iterator();
		Iterator<String> ne=NE.iterator();
		System.out.println("------Eligible List--------");
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
		
		System.out.println("------Not Eligible List--------");
		while(ne.hasNext()) {
			System.out.println(ne.next());
		}
		
	}
}

