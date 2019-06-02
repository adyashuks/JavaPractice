package stringpractice;

public class Palindrome {

	public static void main(String[] args) {
		pal("malayalam");
	}
	
	public static String pal(String s) {
		String s1 = s, s2 = "";
		int len = s1.length();
		for(int i=0; i<len ; i++) {
			 s2 = s1.charAt(i) + s2;
		}
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Nope !!");
		}
		return s1;
	}
}
