package collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lsh = new LinkedHashSet<>();
		lsh.add(1);
		lsh.add(9);
		lsh.add(0);
		lsh.add(2);
		lsh.add(4);
		System.out.println(lsh);
		TreeSet<Integer> ts = new TreeSet<>(lsh);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.ceiling(5));
		System.out.println(ts.floor(3));
		System.out.println(ts);
		
	}

}
