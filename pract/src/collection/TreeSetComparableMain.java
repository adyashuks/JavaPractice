package collection;

import java.util.TreeSet;

public class TreeSetComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<TreeSetComparable> t= new TreeSet<TreeSetComparable>();
		t.add(new TreeSetComparable(1));
		t.add(new TreeSetComparable(9));
		t.add(new TreeSetComparable(111));
		t.add(new TreeSetComparable(12));
		
		TreeSet<Integer> i = new TreeSet<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(10);
        
        System.out.println(t.equals(i) + " "+ i.size());
	}

}
