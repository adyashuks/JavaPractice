package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<>();
		for(int i=0; i< 10; i++) {
			hm.put("index_"+i, String.valueOf(i));
		}
//		hm.values().forEach(System.out::println);
		
		Set<Map.Entry<String, String>> s = hm.entrySet();
		System.out.println(s);
		Set<String> s1 = hm.keySet();
		System.out.println(s1);
		Collection<String> values = hm.values();
		System.out.println(values);
		
		System.out.println("Map impl through Java 8");
		hm.forEach((k,v) -> {
			System.out.println("keys = " + k + "  Value = " + v);
		});
	}

}
