package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterList {
public static void main(String[] args) {
	ArrayList<Object> li = new ArrayList<Object>();
	li.add(1);
	li.add("A");
	li.add(true);
	li.add("D");
	li.add("E");
	
	Iterator<Object> it = li.iterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
}
}
