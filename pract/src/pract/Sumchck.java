package pract;

import java.util.Arrays;

public class Sumchck {

	static int input(int num, int arr[]) {
		System.out.println("array elements are  " + Arrays.toString(arr));
		for(int i = 0; i < arr.length - 1; i++ ) {
			for(int j = i+1; j < arr.length-1; j++) {
				if( arr[i] + arr[j] == num) {
					System.out.println("sum of elements " + arr[i] + " & " + arr[j] + " is equal to " + num);
			}
		}
	}
		return num;
	}
	
	public static void main(String args[]) {
		int num = 5;
		int arr[] = {1, 2, 3, 4, 5};
		int x = input(num, arr);
		System.out.println("x = " +x);
	}
}
