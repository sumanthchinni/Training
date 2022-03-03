package day14;

import java.util.ArrayList;
import java.util.List;

import day13.Person;




public class StreamMap1 {

	public static void main(String[] args) {
		StreamMap1 sm=new StreamMap1();
		List<Employee> empList=sm.createList();
		System.out.println(empList);
		System.out.println("------Female Employees-------");
		empList.stream().filter(e -> (e.getGender() == 'F'))
						.map(e->e.getFirstName()+" "+e.getLastName())
		                .forEach(e->System.out.println(e));
		
		System.out.println("------Male Employees-------");
		empList.stream().filter(e -> (e.getGender() == 'M'))
						.map(e->e.getFirstName()+" "+e.getLastName())
						.forEach(e->System.out.println(e));
		
		

	}
	private static List<Employee> createList() {
		List<Employee> tempList=new ArrayList<Employee>();
		Employee employee=new Employee("Sumanth","Chinni",25000.00,'M');
		tempList.add(employee);
		employee=new Employee("sai","srinath",50000.00,'M');
		tempList.add(employee);
		employee=new Employee("venkata","sneha",15000.00,'F');
		tempList.add(employee);
		employee=new Employee("sai","venkat",10000.00,'M');
		tempList.add(employee);

		return tempList;
	}

}