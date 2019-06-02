package pract;

import java.io.IOException;

public class Copy1 {
	
//	public final Copy1() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String args[])throws IOException {
	int[] list = {1, 2, 3, 5, 4};
	int[] li =new int[10];
	System.arraycopy(list, 0, li, 0, 5);
//	 System.out.println(li.toString());
	for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
	 // Swap list[i] with list[j]
	int temp = list[i];
	 list[i] = list[j];
	 list[j] = temp;
	 
	}
	for(int i= 0;i<li.length;i++) {
		System.out.println(li[i]);
	}
}
}