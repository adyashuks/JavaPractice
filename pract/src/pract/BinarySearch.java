package pract;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2, 4, 7, 10 ,11, 45, 50, 59, 60, 66, 69};
		binsearch(a, 59);
	}
	
	public static int binsearch(int arr[], int key) {
		int low = arr[0], high = arr.length-1;
		int mid = (low+high)/2;
		while(high > low) {
			if(key < arr[mid]) {
				high = mid-1;
			} else if(high < low) {
				low = mid+1;
			} else return mid;
		}
		return -low-1;
	}

}
