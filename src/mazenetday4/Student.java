package mazenetday4;



//Hands on day 4
public class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void displayDetails() {
		System.out.println("Id : "+getId()+"\nName : "+getName());
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(1);
		s1.setName("chinni");
		s1.displayDetails();
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("shanmukha");
		s2.displayDetails();
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("sumanth");
		s3.displayDetails();
	}
}