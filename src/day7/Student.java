package day7;

public class Student {
	String name;
	String grade;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString() {
		return "Name : "+getName()+"    Grade : "+getGrade()+"   Marks: "+getMarks();
	} 
	
	}

