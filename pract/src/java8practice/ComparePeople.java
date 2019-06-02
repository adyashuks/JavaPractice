package java8practice;

import java.util.Comparator;

public class ComparePeople implements Comparator<Person>{


	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getLasName().compareTo(o2.getLasName());
	}

}
