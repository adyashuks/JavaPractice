package arraypractice;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] list) {
		if(list.length > 1) {
			//Merge sort the first half
			int firstHalf[] = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			mergeSort(firstHalf);
			
			int secondHalfLength = list.length - list.length/2;
			int secondHalf[] = new int[secondHalfLength];
//			System.arraycopy(src, srcPos, dest, destPos, length);
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			merge(firstHalf, secondHalf, list);

		}
	}
	
	public static void merge(int[] list1, int[] list2, int[] temp) {
		int curr1 = 0; //Current index in list1
		int curr2 = 0; //Current index in list2
		int curr3 = 0; //Current index in temp
		
		while(curr1 < list1.length && curr2 < list2.length) {
			if(list1[curr1]< list2[curr2]) {
				temp[curr3++] = list1[curr1++];
			} else {
				temp[curr3++] = list2[curr2++];
			}
		}
		while(curr1 < list1.length) {
			temp[curr3++] = list1[curr1++];
		}
		while(curr2 < list2.length) {
			temp[curr3++] = list2[curr2++];
		}
 	}
	
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		System.out.println("Unsorted : " + Arrays.toString(list));
		mergeSort(list);
		System.out.println("Sorted : " + Arrays.toString(list));
//		for(int i =0; i< list.length ; i++) {
//			System.out.println(list[i]);
//		}
	}
}
