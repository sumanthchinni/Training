package day1;

public class Method {
	
	public int sum(int x, int y) {
		return x+y;
	}
	public int subtract(int x, int y) {
		return x-y;
	}
	public int multiply(int x, int y) {
		return x*y;
	}
	public int division(int x, int y) {
		return x/y;
	}

	public static void main(String[] args) {
		Method obj=new Method();
		int sum=obj.sum(9,10);
		System.out.println("sum is = "+sum);
		int sub=obj.subtract(9,10);
		System.out.println("subtract is = "+sub);
		int multiply=obj.multiply(9,10);
		System.out.println("multiplication is = "+multiply);
		int division=obj.division(9,10);
		System.out.println("division is = "+division);
		

	}

}
