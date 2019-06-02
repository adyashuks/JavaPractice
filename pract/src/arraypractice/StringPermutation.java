package arraypractice;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("All the permutations of the string are: "); 
		int len = str.length();
		 permute(str, 0, len);
		System.out.println();
	}
	public static String swap(String s, int start, int end) {
		char [] ch = s.toCharArray();
		char c;
		c = ch[start];
		ch[start] = ch[end];
		ch[end] = c;
		return String.valueOf(ch);
	}
	public static void permute(String s, int l, int r) {
		for(int i=l; i< r; i++) {
			s = swap(s, 0, i);
			permute(s, l+1,r);
			s=swap(s,l, i);
		}
	}
	
}
