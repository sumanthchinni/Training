package mazenetday14;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID=1L;
	
	String name;
	int experience;
	double salary;
	
	Employee(String name, int experience,double salary){
		this.name=name;
		this.experience=experience;
		this.salary=salary;
	}
	public String toString(){
		return "Name : "+name+"\nAge : "+experience+"\nsalary "+salary;
	}

	

}
