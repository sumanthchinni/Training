package mazenetday5;


public abstract class Bike {
	public abstract void run();
	


	public static void main(String[] args) {
		Honda h1=new Honda();
		h1.run();
	}
}

class Honda extends Bike {
	@Override
	public void run() {
		System.out.println("honda class is derived from bike class");
	}

}

	


