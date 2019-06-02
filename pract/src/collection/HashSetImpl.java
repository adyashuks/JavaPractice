package collection;

import java.util.HashSet;

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		System.out.println(hs.remove("A"));
		System.out.println(hs.isEmpty());
		System.out.println(hs);
	}

}
