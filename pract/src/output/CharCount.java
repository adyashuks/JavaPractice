package output;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args)throws IOException{
		String a= "proramming".trim();
		String b= a.trim();
		System.out.println("a == b  " + a==b);
		count(a);
	}
	
	public static void count(String s) {
		char ch[] = s.toCharArray();
//		int len = ch.length;
//		int count = 0;
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry entry : hm.entrySet() ) {
//			System.out.println("Key = " + entry.getKey() + "  Value = " + entry.getValue());
			if(Integer.parseInt(entry.getValue().toString()) >  1) {
				System.out.println("Key = " + entry.getKey() + "  Value = " + entry.getValue());
			}
			
		}
		
	}
}
