package java8practice;

import java.util.stream.Stream;

public class StringPrac1 {

	public static void main(String[] args) {
		String names [] = {"Adya", "Vartika", "Anubha" , "Rachit", "Pranshu"};
		String.valueOf(names);
		Stream<String> s = Stream.of(names);
		s.sorted().forEach(i-> System.out.println(i));
	}
}
