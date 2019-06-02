package pract;

import java.util.Arrays;

public class ArrayEqual{
	
static boolean checkarr(int[] a, int b[]) {
	boolean c = true;
	if(a.length == b.length) {
		for(int i=0; i< a.length-1 ; i++) {
			if(a[i] != b[i]) {
				c= false;
			}
		}
	} else {
		c = true;
		System.out.println(" equal");
	}
	return c;

}
public static void main(String args[]) {
	int a[] = {1,2,3, 5};
	int b[] = {1,2,4,3,5};
	System.out.println("First Array : "+Arrays.toString(a));
	System.out.println("First Array : "+Arrays.toString(b));
	boolean x = checkarr(a, b);
	System.out.println("jh = " + x);
	Double z = 3.5;
	 System.out.println(z.intValue());
	 System.out.println(z.compareTo(4.5));
}
}
