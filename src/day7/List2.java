package day7;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		List<String> num=new ArrayList<String>();
		num.add("ongole");
		num.add("vizag");
		num.add("hyderadad");
		num.add("bangalore");
		
		System.out.println("size : "+num.size());
		for(int i=0;i<num.size();i++) {
			System.out.println("city : "+num.get(i));
		}
		for (String i : num) {
			System.out.println(i);
			
		}
	}

}
