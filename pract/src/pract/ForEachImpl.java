package pract;

import java.util.HashMap;
import java.util.Map;

// Implementation of foEach in Maps
public class ForEachImpl {

	public static void main(String args[]) {
		Map<Integer, String> items = new HashMap<Integer, String>();
		items.put(1, "Adya");
		items.put(2, "Rachit");
		items.put(3, "Pranshu");

		items.forEach((i,j)-> {
			System.out.println( " values are : " + i + j);
		});
	}
}
