package pract;

import java.io.IOException;

public class LinearSearc {

	public static int searchd(int x[], int n) {
//		int index = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == n) {
				System.out.println("Search success");
				return i;
			} 
		}
		return -1;

	}

	public static void main(String args[]) throws IOException {
		int[] arr = { 1, 2, 3, 4, 9, 5 };
		int j = searchd(arr, 9);
		System.out.println("i = " + j);
	}
}
