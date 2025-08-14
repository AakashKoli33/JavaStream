package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {

	public static void main(String[] args) {
		
        // Create a list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(12);
		list1.add(14);
		
	    List<Integer> list2 = List.of(10,13,15,17,2,4,6,7,21,76,99);
//	    list2.add(155);
	    System.out.println(list2);
	    List<Integer> list3 = Arrays.asList(10,2,24,45,55);
	    
	    // but in above these two method we cannot add new integer in these list they are immutable
	    
	    //fetching even number from the list2 
	    //Normal method
		List<Integer> evenList = new ArrayList<>();
		for (Integer i : list2) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println("Even List : " + evenList);
		
		//By using Stream
		Stream<Integer> stream = list2.stream();  // initilize stream
		List<Integer> eList = stream.filter(i -> i%2==0)	
		                            .collect(Collectors.toList());
		
		List<Integer> elists = list2.stream()
				                    .filter(i -> i%2==0)
				                    .collect(Collectors.toList());
		System.out.println("Even List using Stream : "+elists);
		
//		list.stream(): Converts the list to a stream.
//		filter(n -> n % 2 == 0): Filters only even numbers.
//		collect(Collectors.toList()): Collects the filtered results back into a list.
		
		
		List<Integer> glist = list2.stream()
                .filter(i -> i>10)
                .collect(Collectors.toList());
		
		System.out.println(glist);
	}

}
