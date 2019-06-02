package java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamEx {
public static void main(String[] args) {
	List<Integer> li = new ArrayList<Integer>();
	for(int i = 0; i< 10; i++) {
		li.add(i);
	}
	System.out.println(li.stream().filter(i-> i%2 == 0).collect(Collectors.toList()));
	
	List<String> s = new ArrayList<String>();
	s.add("Adya");
	s.add("Shukla");
	s.add("Rachit");
	s.add("Kumar");
	s.add("Bhatnagar");
	System.out.println(s.stream().sorted().collect(Collectors.toList()));
	System.out.println(s.stream().map(i-> i.toString().toUpperCase()).collect(Collectors.toList()));
}
}
