package output;

import java.util.ArrayList;
import java.util.Collections;

public class CompareableExample  {

public static void main(String args[]) {
	ArrayList<ComparableStrudent> li = new ArrayList<>();
	li.add(new ComparableStrudent("Adya", 1));
	li.add(new ComparableStrudent("Rkb", 2));
	li.add(new ComparableStrudent("Pranshu", 10));
	li.add(new ComparableStrudent("Adya", 3));
	
	CompareName cc = new CompareName();
	
Collections.sort(li,cc);
for(ComparableStrudent c : li) {
	System.out.println(c.getName() +" " + c.getId());
}
}
}