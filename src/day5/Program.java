package day5;

public class Program {
	static int count=0;
	int counter=1;
	
	public void increment() {
		System.out.println("incremented");
		count++;
	}
	public void displayCount() {
		System.out.println("count = "+count);
	}
	
	public void displayCounter() {
		System.out.println("Without static count = "+counter);
	}
	
	
	
	public static void main(String[] args) {
		Program p1=new Program();
		p1.increment();
		Program p2=new Program();
		p2.increment();
		Program p3=new Program();
		p3.increment();
		Program p4=new Program();
		p4.increment();
		Program p5=new Program();
		p5.increment();
		
		p1.displayCount();
		p1.displayCounter();
	
		

	}

}
