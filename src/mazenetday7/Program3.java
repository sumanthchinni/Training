package mazenetday7;

import java.util.Stack;

public class Program3 {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(25);
		s1.push(12);
		s1.push(45);
		s1.push(10);
		s1.push(5);

		s1.pop();
		System.out.println(s1);

	}

}
