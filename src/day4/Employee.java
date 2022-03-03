package day4;

public class Employee {
	private static int id=0;
	private String deptname;
	private double salary;
	private String name;

	Employee(String name,String deptname,double salary){
		
		this.name=name;
		this.deptname=deptname;
		this.salary=salary;
	}
	
    Employee(){
    	
    }
    
	public int getId() {
		id++;
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Name : "+name+" id : "+id+" Department Name : "+deptname+" Salary : "+salary);
		}
	
public static void main(String[] args) {
	Employee e1=new Employee("sumanth","cse",2500.00);
	e1.getId();
	e1.getEmployeeDetails();
	
	Employee e2=new Employee();
	e2.getId();
	e2.getEmployeeDetails();
	
	Employee e3=new Employee();

	e3.setName("chinni");
	e3.setDeptname("cse");
	e3.setSalary(2345.00);
	e3.getId();
	e3.getEmployeeDetails();
	
	
}
}

