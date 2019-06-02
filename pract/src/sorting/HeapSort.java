package sorting;

public class HeapSort {

	public static void main(String[] args) {

		int[] a = {22,13,17,11,10,14,12};
		sort(a);
		printArray(a);
	}
	public  static void sort(int arr[]) {
		int length = arr.length;
		for(int i= length/2-1; i>=0; i--) {
			heapify(arr, length, i);
		}
		for(int i = length-1; i>= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	public static void heapify(int arr[], int len, int i ) {
		int largest = i;
		int left = 2*i +1;
		int right = 2*i+2;
		if(left < len && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right < len && arr[right] > arr[largest]) {
			largest = right;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, len, largest);
		}
	}
	
	public static void printArray(int arr[]) {
		for(int j = 0; j< arr.length; j++) {
		System.out.println(arr[j]);
	}
	}

}
