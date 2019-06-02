package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserMap {

	public static void main(String[] args) {

//		HashMap<Integer, User> hm = new HashMap<>();
		Map<Integer, User> hm = new TreeMap<>(Collections.reverseOrder());
		hm.put(1, new User(1, "A", "address1"));
		hm.put(12, new User(2, "B", "address2"));
		hm.put(3, new User(3, "C", "address3"));
		hm.put(18, new User(4, "A", "address1"));
		
		hm.forEach((k,v)-> {
			System.out.println("Keys = " + k + " values " + v);
		});
	}
	
	
}
