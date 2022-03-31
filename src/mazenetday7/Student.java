package mazenetday7;

public class Student implements Comparable<Student>  {
	private int rollNo;
	private String name;
	private int age;
	
	Student(int rollNo,String name,int age){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

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
		return "roll No : "+rollNo+" Name: " +name+" Age : "+age+"\n";
	}
	@Override
	public int compareTo(Student s) {
		if(age==s.age) {
			return 0;
		}
		else if(age>s.age){
			return 1;
		}
		else {
			return -1;
		}
	}
}
