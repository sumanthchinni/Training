package day13;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID=1L;
	
	String name;
	int age;
	double salary;
	
	Employee(String name, int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Name : "+name+"\nAge : "+age+"\nsalary "+salary);
	}

	

}
