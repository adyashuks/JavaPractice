package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {5, 1, 6, 2, 4, 3};
		for(int i = 0; i< a.length; i++) {
			for(int j=0; j< a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
					
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Sorted array = " +a[i]);
		}
	}
}
