package mazenetday5;



//hands on day5

class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	Person(){
		
	}
}
class Emp extends Person{
	double salary;
	Emp(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
		
	}
	public void displayDetails() {
		System.out.println("Id : "+id+"\nName : "+name+"\nSalary : "+salary);
	}
	
}

public class PersonMain {

	public static void main(String[] args) {
		Emp e1=new Emp(1,"sumanth",25000.0);
		e1.displayDetails();
		
		Emp e2=new Emp(2,"chinni",50000.0);
		e2.displayDetails();

	}

}