package mazenetday7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<Student>();
		
		Student s1=new Student(45,"Chinni",15);
		l1.add(s1);
		Student s2=new Student(12,"Sumanth",21);
		l1.add(s2);
		Student s3=new Student(68,"Arun",25);
		l1.add(s3);
		
		

		System.out.println("Sorting Name using Comparator");
		Collections.sort(l1,new StudentComparator());
        System.out.println(l1);
      
        System.out.println("Sorting Age using Comparable");
        Collections.sort(l1);
		for(Student s: l1) {
			System.out.println("Roll No : "+s.getRollNo()+"  Name : "+s.getName()+"   Age : "+s.getAge());
		}
	}

}
