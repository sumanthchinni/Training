package day7;
import java.util.*;
public class Program {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name : "+getName()+"    Age : "+getAge();
	}


public static void main(String[] args) {
	List<Program> ProgramList=new ArrayList<>();
	Program p1=new Program();
	p1.setName("sumanth");
	p1.setAge(21);
	ProgramList.add(p1);
	p1=new Program();
	p1.setName("chinni");
	p1.setAge(19);
	ProgramList.add(p1);
	
	for (Program p: ProgramList) {
		System.out.println(p);
	}
	
	
	
}
}
