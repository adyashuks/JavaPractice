package stringpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceRegex {

	public static void main(String[] args) {
		String name = "Rachit Kumar Bhatnagar";
		Pattern p = Pattern.compile("\\s.");//. represents single character  
		Matcher m = p.matcher(name);  
		boolean b = false;
		if(m.find()) {
			System.out.println("matcher.group.length = " + m.group().length());
		}
		while(m.find()) {
			System.out.println(m.group());
			System.out.println("I found the text "+ m.group()+" starting at index "+    
	                 m.start()+" and ending at index "+m.end());
			b= true;
		}
		if(!b){    
            System.out.println("No match found.");    
        } 
	}

}
