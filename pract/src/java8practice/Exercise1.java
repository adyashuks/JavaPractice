package java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Adya", "Shukla", 24),
				new Person("Adi", "Shuks", 22),
				new Person("Ady", "Shukl", 23),
				new Person("Ad", "Shu", 21)
				);
//		ComparePeople compare = new ComparePeople();
//		Collections.sort(people, compare);
		
//		TO implement using Lambda 
		Collections.sort(people, (p1, p2)->p1.getLasName().compareTo(p2.getLasName()));
		
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getAge() > 22;
			}
		});
		
		for(Person c : people) {
		System.out.println(c.getFirstName() + " "  + c.getLasName());
		}
	}
	
	private static void printConditionally(List<Person> people, Condition condition ) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p.getFirstName()  + " " + p.getLasName());
			}
		}
	}

	interface Condition{
		boolean test(Person p);
	}
}
