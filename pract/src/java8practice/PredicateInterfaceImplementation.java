package java8practice;

import java.util.function.Predicate;

// This interface was introduce in Java 8 and has only 1 method boolean test(), so a functionalInterface..
//It accepts an argument and return boolean value
public class PredicateInterfaceImplementation {

	public static void main(String[] args) {

//		Predicate<String> p = s->(s.length() > 5);
//		System.out.println(p.test("Adya"));
//		System.out.println(p.test("Shukla"));
//		
//		Predicate<Integer> v = i-> i.equals(6);
//		System.out.println(v.test(8));
		
		
		int x[] = {2,4,6,8,10, 11,12,14, 13,15,17,19};
		
		Predicate<Integer> p1 = i-> i%2==0;
		Predicate<Integer> p2 = i-> i>11;
		System.out.println("Prdicate joi USe .or() : ");
		methodss(p1.or(p2), x);
		System.out.println("Prdicate joi USe .and() : ");
		methodss(p1.and(p2), x);
	}
	
	static void methodss(Predicate<Integer> p, int[] x) {
		for(int val : x) {
			if(p.test(val))
			System.out.println(val);
		}
	}

}
