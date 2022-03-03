package day5;

public class Employee {
	private int empId;
	private String empName;
	private String designation;
	private double salary;
	private String insurance;
	
	Employee(){
		
	}
	Employee(int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		if (salary>40000) {
			this.designation="Manager";
			this.insurance="IA";
		}
		else if (salary>20000 && salary<40000) {
			this.designation="Programmer";
			this.insurance="IB";
		}
		else if (salary>5000 && salary<20000) {
			this.designation="System Associate";
			this.insurance="IC";
		}
		else {
			this.designation="House Keeping";
			this.insurance="NA";
			
		}
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	public void getEmployeeDetails() {
		System.out.print("Employee Name : "+getEmpName()+"\nEmployee Id : "+getEmpId()+
				"\nEmployee Salary : "+getSalary()+"\nEmployee Designation : "+getDesignation()+
				"\nEmployee Insurance : "+getInsurance()+"\n\n");
	}
	
	
	
}
