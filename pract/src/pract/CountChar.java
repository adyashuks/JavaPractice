package pract;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//import java.util.Random;
//import java.util.Scanner;

public class CountChar {
	public static void main(String args[]) throws IOException {
		String str= "malyalam";
		charCount(str);
	}	

	public static void charCount(String str) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Map.Entry entry : hm.entrySet()) {
			System.out.println("key " + entry.getKey() + "  value  " + entry.getValue());
		}
	}
}
