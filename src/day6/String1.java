package day6;
import java.util.*;
public class String1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int start=s.indexOf("/");
		int end=s.lastIndexOf("/");
		System.out.println("month : "+s.substring(start+1,end));
	}
	
	

}
