package com.mt.exceptions;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the salary");
			int salary=sc.nextInt();
			Program p1=new Program();
			p1.salary(salary);
		}catch(SalaryException s) {
			System.out.println(s);
		}
		}
	public void salary(int salary)throws SalaryException {
		if (salary<5000) {
			throw new SalaryException("salary is less than 5000");
		}
		else {
			System.out.println("salary is ok");
		}
	}

}
