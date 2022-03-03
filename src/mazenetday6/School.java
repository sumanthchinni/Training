package mazenetday6;

class School {
	String school;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
  class Student{
	  String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void describe() {
		System.out.println("School Name : "+getSchool()+"    Student Name : "+getStudentName());
	}
	  
  }

	public static void main(String[] args) {
		School sc=new School();
		sc.setSchool("Pragathi High school");
		
		School.Student st1=sc.new Student();
		st1.setStudentName("Chinni");
		st1.describe();
		
		School.Student st2=sc.new Student();
		st2.setStudentName("Shanmukha");
		st2.describe();
		
		School.Student st3=sc.new Student();
		st3.setStudentName("Sumanth");
		st3.describe();
		

	}

}
