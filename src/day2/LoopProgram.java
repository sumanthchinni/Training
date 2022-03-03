package day2;

import java.util.*;

public class LoopProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		LoopProgram obj = new LoopProgram();
		int num = obj.num(a);
		

	}
	public  int  num(int a) {
		for (int i=1;i<=10;i++) {
			int b=a*i;
			System.out.println(a+" * " +i + " = "+b);
		}
		return 0;
	}

}
