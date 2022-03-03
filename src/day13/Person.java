package day13;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	 
	Person(String firstName,String lastName,int age,char gender){
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.gender=gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append(getFirstName()).append(" ");
		sb.append(getLastName()).append(" ");
		sb.append(getAge()).append(" ");
		sb.append(getGender());
		return sb.toString();
		
		
	}

}
