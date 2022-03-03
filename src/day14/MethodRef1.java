package day14;

import java.util.Arrays;

interface InStringFunc<T,R>{
	R stringFunc(T t);

}

public class MethodRef1 {

	public static void main(String[] args) {
		String[] strNames=new String[]{"Chinni","Shanmukha","Sumanth","Naveen","Arshad"};
		InStringFunc<String[],String[]> stringFunc=SortClass::sortName;
	    String[] sortedNames= stringFunc.stringFunc(strNames);
        for (String name:sortedNames) {
 			System.out.println(name);
		}

	}
        
}
class SortClass{
	static String[] sortName(String[] names) {
	    Arrays.sort(names);
		return names;
	}
}
