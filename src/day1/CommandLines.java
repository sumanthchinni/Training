package day1;

public class CommandLines {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if (a>b) {
			System.out.println("Maximum number is "+a);
		}
		else {
			System.out.println("Maximum number is "+b);
		}

	}

}
