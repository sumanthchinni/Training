package mazenetday5;

//Hands on day5
class Employee1 {
	double salary;
	Employee1(double salary){
		this.salary = salary;
	}
	
}
class Programmer extends Employee1{
	int bonus;
	float total_salary;
	Programmer(double salary,int bonus){
		super(salary);
		this.bonus = bonus;
		
	}
	
	
	public void getTotalSalary() {

		total_salary=(float) (bonus+salary);
		System.out.println("Total Salary : "+total_salary);
	}
}
public class Employee {
		public static void main(String[] args) {
		
		Programmer p1=new Programmer(2500.0,500);
		p1.getTotalSalary();
		
	}

	}

