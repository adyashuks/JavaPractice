package java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		for(int i=0; i< 10; i++) {
			li.add(i);
		}
		Stream<Integer> s = li.stream();
		System.out.println(s.filter(i-> i %2 == 0).collect(Collectors.toList()));
		System.out.println(s.max((k, j)-> k.compareTo(j)));
//		Optional<T>
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.stream().sorted().forEach(i-> System.out.println(i));
	}
}
