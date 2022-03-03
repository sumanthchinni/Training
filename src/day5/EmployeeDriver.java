package day5;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setEmpId(123);
		emp1.setEmpName("sumanth");
		emp1.setSalary(35000);
		emp1.getEmployeeDetails();
		
		Employee emp2=new Employee();
		emp2.setEmpId(456);
		emp2.setEmpName("chinni");
		emp2.setSalary(24000);
		emp2
		.getEmployeeDetails();
		
	}

}
