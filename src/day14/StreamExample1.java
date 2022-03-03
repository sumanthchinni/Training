package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,9,3,8,6,9,8,7,10,4);
	    System.out.println("Originial list : "+list);
	    
	    List<Integer> distinctList=list.stream().distinct().collect(Collectors.toList());
	    System.out.println("Distinct List : "+distinctList);
	    
	    long count=list.stream().count();
	    System.out.println("list count : "+count);
	    
	    //Optional<Integer> opt=list.stream().min((a,b)-> a.compareTo(b)); 
	    Optional<Integer> opt=list.stream().min(Integer::compare);
	    if(opt.isPresent()) {
	    	System.out.println("Minimum value : "+opt.get());
	    }
	    
	    List<Integer> filter=list.stream().filter(a-> a>5).collect(Collectors.toCollection(ArrayList::new));
	    System.out.println("filter List : "+filter);
	    
	    List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
	    System.out.println("Sorted List : "+sortedList);
	}

}
