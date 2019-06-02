package collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class CountOccurrenceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Good morning. Have a good class. " +
				  "Have a good visit. Have fun!";
		
		TreeMap<String, Integer> t= new TreeMap<>();
		String[] words = text.split(Pattern.quote("\\[ \n\t\r.,;:!?(){"));

		for(int i =0; i< words.length; i++) {
			String key = words[i].toLowerCase();
			if(key.length() > 0) {
				if(!t.containsKey(key)) {
					t.put(key, 1);
				} else {
					int value = t.get(key);
					value++;
					t.put(key, value);
						
				}
			}
		}
		
		Set<Map.Entry<String, Integer> > entry = t.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
