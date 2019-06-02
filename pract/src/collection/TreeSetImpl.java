package collection;

import java.util.TreeSet;

import output.ComparableStrudent;
import output.CompareName;

public class TreeSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<ComparableStrudent> li = new TreeSet<>(new CompareName());
li.add(new ComparableStrudent("Adya", 1));
li.add(new ComparableStrudent("Rkb", 2));
li.add(new ComparableStrudent("Pranshu", 10));
li.add(new ComparableStrudent("Adya", 3));

for(ComparableStrudent s : li) {
	System.out.println(s);
}
	}

}
