package day7;

import  java.util.*;
import java.util.Map.Entry;
public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> city=new HashMap<>();
		
		city.put(1,"Hyderabad");
		city.put(2,"Bangalore");
		city.put(3,"Chennai");
		city.put(4,"Mumbai");
		city.put(5,"Vijayawada");
		
		System.out.println(city.get(1));
		//Key set
		Set<Integer> key=city.keySet();
		for(Integer i: key) {
			System.out.println("key : "+i);
		}
		
		//Value set
		Collection<String> value=city.values();
		for(String i: value) {
			System.out.println("key : "+i);
		}
		
		//Entry set
		Set<Entry<Integer,String>> entryset=city.entrySet();
		for(Entry<Integer,String> i :entryset) {
			System.out.println("Key is : "+i.getKey()+"   Value is : "+i.getValue());
		}
		
	}



}
