package pract;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		 Map<String, String> map = new HashMap<>();
		 map.put("123", "John Smith");
		 map.put("111", "George Smith");
		 map.put("123", "Steve Yao");
		 map.put("222", "Steve Yao");
		 System.out.println("(1) " + map);
		 System.out.println("(2) " + new TreeMap<String, String>(map));
		 }
}