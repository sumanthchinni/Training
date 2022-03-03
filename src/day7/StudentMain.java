package day7;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		List<Student> Student=new ArrayList<>();
		List<Student> E=new ArrayList<>();
		List<Student> NE=new ArrayList<>();
		Student s=new Student();
		s.setName("Sumanth");
		s.setGrade("A");
		s.setMarks(85);
		Student.add(s);
		
		s=new Student();
		s.setName("chinni");
		s.setGrade("B");
		s.setMarks(75);
		Student.add(s);
		
		s=new Student();
		s.setName("sai");
		s.setGrade("A");
		s.setMarks(95);
		Student.add(s);
		
		s=new Student();
		s.setName("vamsi");
		s.setGrade("C");
		s.setMarks(45);
		Student.add(s);
		
		
		for(Student i: Student) {
				if (i.getMarks()>80) {
					E.add(i);
				}
				else {
					NE.add(i);
				}
		}
		
		System.out.println("-------Scholarship Eligible list-------");
		for(Student j:E) {
			System.out.println(j);
		}
		System.out.println("-------Scholarship Not Eligible list-------");
		for(Student k:NE) {
			System.out.println(k);
		}
		
		
		

	}

}
