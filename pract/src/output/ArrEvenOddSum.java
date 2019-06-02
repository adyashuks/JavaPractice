package output;

import java.util.Arrays;

public class ArrEvenOddSum {

	public static void sum(int[] arr) {
		int even=0,  odd=0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]%2 == 0) {
				even += arr[i];
			} else {
				odd+= arr[i];
			}
		}
		System.out.println("EVen = " +even);
		System.out.println("Odd = " + odd);
		Arrays.stream(arr).filter(i -> i%2==0).map(n -> n).sum();
		System.out.println("Even sum using Java8 " + Arrays.stream(arr).filter(i -> i%2==0).map(n -> n).sum());
		System.out.println("Odd sum using Java8 " + Arrays.stream(arr).filter(i -> i%2!=0).map(n -> n).sum());
	}
	
	public static void main(String[] args) {
		int a[] = {5,10,15,20,25,30};
		sum(a);
	}
}
