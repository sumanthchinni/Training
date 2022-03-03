package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonLambda {

	public static void main(String[] args) {
		List<Person>personList=createList();
		
		Predicate<Person> allFemales= p -> p.getGender()=='F'; 
		Predicate<Person> allVoters = p -> p.getAge() >= 18;
		Predicate<Person> allSeniorCitizens = p -> p.getAge() >=60;
		
		List<Person> femaleList=getVerifiedList(personList,allFemales);
		System.out.println("females list : "+femaleList);
		List<Person> voterList=getVerifiedList(personList,allVoters);
		System.out.println("Voters list : "+voterList);
		List<Person> seniorCitizen=getVerifiedList(personList,allSeniorCitizens);
		System.out.println("Senior Citizens list : "+seniorCitizen);
	}
	
	private static List<Person> getVerifiedList(List<Person> personList,Predicate<Person> pred){
		List <Person> newList=new ArrayList<Person>();
		for(Person person:personList) {
			if(pred.test(person)) {
				newList.add(person);
			}
		}return newList;
		
	}
	
	private static List<Person> createList() {
		List<Person> tempList=new ArrayList<Person>();
		Person person=new Person("Sumanth","Chinni",21,'M');
		tempList.add(person);
		person=new Person("sai","srinath",65,'M');
		tempList.add(person);
		person=new Person("venkata","sneha",17,'F');
		tempList.add(person);
		person=new Person("sai","venkat",17,'M');
		tempList.add(person);
		System.out.println("List :"+tempList);
		return tempList;
		
		
		
		
	}

}
