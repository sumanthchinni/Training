package day14;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private char gender;
	
	Employee(String firstName,String lastName,double salary,char gender){
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(getFirstName()).append(" ");
		sb.append(getLastName()).append(" ");
		sb.append(getSalary()).append(" ");
		sb.append(getGender()).append(" ");
		return sb.toString();
	}

}
