package day1;

public class CommandLine {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if (a>0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("Negative number");
		}

	}

}
