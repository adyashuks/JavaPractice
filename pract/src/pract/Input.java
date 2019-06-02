package pract;

import java.io.IOException;
import java.util.*;

public class Input {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//Shift elements
		int temp= arr[0];
		for(int i = 1;i<arr.length ; i++) {
			arr[i-1] = arr[i];
//			System.out.println(arr[i]);
		}
		arr[arr.length-1] = temp;
		System.out.println(arr);
//		for(int i= 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		sc.close();
	}
}
//Calculate maximum element in an array at minimum index eg, 1,5,3,,4,5,5
/*
int max = arr[0], minindex = 0;
for (int i = 0; i < arr.length; i++) {
	if (max < arr[i]) {
		max = arr[i];
		minindex = i;
	}
}
System.out.println("Max value =" + max);
System.out.println("Min value =" + minindex);*/
