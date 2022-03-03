package mazenetday6;

public class Car {
	String make;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	
public class Wheel{
		String make1;

		public String getMake1() {
			return make1;
		}

		public void setMake1(String make1) {
			this.make1 = make1;
		}
		public void display() {
			System.out.println("Car : "+getMake()+"    Wheel : "+getMake1());
		}
		
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.setMake("Maruti");
		
		Car.Wheel w1=c.new Wheel();
		Car.Wheel w2=c.new Wheel();
		Car.Wheel w3=c.new Wheel();
		Car.Wheel w4=c.new Wheel();
		
		w1.setMake1("MRF");
		w2.setMake1("MRF");
		w3.setMake1("MRF");
		w4.setMake1("MRF");
		
		w1.display();
		w2.display();
		w3.display();
		w4.display();
	}

}
