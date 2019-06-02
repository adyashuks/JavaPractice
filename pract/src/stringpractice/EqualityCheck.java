package stringpractice;

public class EqualityCheck {

	public static void main(String[] args) {
		String s1 =  " Welcome ";
		String s2 =  " welcome ";
		boolean isEqual= s1.equalsIgnoreCase(s2);
		System.out.println(isEqual);
	}
}
