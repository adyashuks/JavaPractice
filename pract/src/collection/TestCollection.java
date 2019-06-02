package collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
	 ArrayList<String> collection1 = new ArrayList<>();
	  collection1.add("New York");
	  collection1.add("Atlanta");
	  collection1.add("Dallas");
	  collection1.add("Madison");
	  System.out.println(collection1);
	  System.out.println("\nIs Dallas in collection1? "
			   + collection1.contains("Dallas"));
	  
	  ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
	  Collection<String> collection2 = new ArrayList<>();
	  collection2.add("Seattle");
	  collection2.add("Portland");
	  collection2.add("Los Angeles");
	  
	  c1.addAll(collection2);
	  System.out.println(c1);
	}
}
