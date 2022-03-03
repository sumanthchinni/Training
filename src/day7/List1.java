package day7;
import java.util.*;
public class List1 {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(5);
		num.add(8);
		num.add(10);
		num.add(55);
		System.out.println("size : "+num.size());
		for(int i=0;i<num.size();i++) {
			System.out.println("num : "+num.get(i));
		}
		for (int i : num) {
			System.out.println(i);
			
		}

	}

}
