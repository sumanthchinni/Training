package mazenetday5;

import mazenetday4.Animal;


public class Mammal extends Animal {
		String mammalName;
		String color;
		Mammal(String food,int noOfLegs,String mammalName,String color){
			super(food,noOfLegs);
			this.mammalName=mammalName;
			this.color=color;
		}
		public void displayDetails() {
			System.out.println("Mammal Name : "+mammalName+"   color : "+color+"   No of legs : "
						+this.noOfLegs+"   Food  : "+this.food);
		}
		public static void main(String[] args) {
			Mammal m1=new Mammal("Milk",4,"Cat","White");
			m1.getAnimalDetails();
			m1.displayDetails();
			Mammal m2=new Mammal("Biscuits",4,"Dog","Brown");
			m2.getAnimalDetails();
			m2.displayDetails();


	}
}


