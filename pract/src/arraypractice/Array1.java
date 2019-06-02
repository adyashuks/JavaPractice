package arraypractice;

import java.util.Random;

public class Array1 {

	public static void main(String args[]) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = arr1;
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] + 1;
		}
		for(int i =0 ; i< arr1.length; i++) {
			System.out.println( "Array1[" + i +"] " + arr1[i]);
			System.out.println( "Array2[" + i +"] " + arr2[i]);
		}
		
	}
	

}
