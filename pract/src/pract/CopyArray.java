package pract;

import java.io.IOException;

public class CopyArray {
	public static void main(String args[]) throws IOException {
		int[] source = { 1, 2, 3, 4, 5 };
//		int[] target = new int[source.length];
//		System.arraycopy(source, 0, target, 0, source.length);
//		System.out.println("Values = ");
//		for (int i : target) {
//			System.out.println("targetvalue " + i);
//		}
		int[] target = rev(source);
		for(int n : target) {System.out.println(n);}
		
	}

	public static int[] rev(int a[]) {
		int[] res = new int[a.length];
		// for(int i=0, j=res.length-1; i<a.length
		// )
		for (int i = 0, j = res.length - 1; i < a.length; i++, j--) {
			res[j] = a[i];
		}
		return res;
	}
}