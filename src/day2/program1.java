package day2;

public class program1 {

	public static void main(String[] args) {
		int transactions=Integer.parseInt(args[0]);
		
		if (transactions<=5){
			System.out.println("Ok");
		}
		else if(transactions>5 && transactions<10){
			System.out.println("Notifying the user");
			
			
		}
		else {
			System.out.println("Warning , Your account has unusual activity" );
		}
			

	}

	

}
