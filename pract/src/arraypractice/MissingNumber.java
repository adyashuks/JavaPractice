package arraypractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
public static void main(String[] args) {
	int num[] = {1, 2, 4, 6, 3, 7, 8};
//	for(int i = 0; i< num.length; i++) {
//		num[i] = i;
//	}
	numsum(num);
}
public static void numsum(int[] arr) {
//	IntStream x = Arrays.stream(arr).
	int n = arr.length;
	int sum = 0;
	for(int i = 0; i<n; i++) {
		sum = sum + arr[i];
	}
	int total = n * (n+1) /2;
	System.out.println("Mising = " + (sum- total));
}
}
