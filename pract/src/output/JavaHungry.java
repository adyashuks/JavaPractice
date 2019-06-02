package output;

public class JavaHungry {

	public static void main(String[] args) {
		
//		String s1 = "abc";
//		String s2 = s1;
//		s1 +="d";
//		System.out.println(s1 + " " + s2 + " " + (s1==s2));
//		
//		StringBuffer sb1 = new StringBuffer("abc");
//		StringBuffer sb2 = sb1;
//		sb1.append("d");
//		System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
		javahungryme();
	}
	public static int javahungryme() {
		try {
			System.out.println("try");
			return 10;
		}
		catch(Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("Finally");
			return 12;
		}
	}

}
