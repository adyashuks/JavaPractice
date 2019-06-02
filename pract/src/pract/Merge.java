package pract;

public class Merge {

	public static int[] merge(int a[], int b[]) {
		int len1 = a.length;
		int len2 = b.length;
		int i=0, j=0, k=0;
		int[] res = new int[len1+len2];
		while(i < len1 && j< len2) {
			if(a[i] < b[j]) {
				res[k++] = a[i++];
			}
			else {
				res[k++] = b[j++];
			}
		}
		
		while(i < len1) {
			res[k++] = a[i++];
		}
		while (j< len2) {
			res[k++] = b[j++];
		}
		return res;
	}

public static void main(String args[]) {
	int[] a = {1,3,5,7};
	int[] b = {2,4,6,8};
	int[] res= merge(a,b);
	for(int i = 0; i< res.length; i++) {
		System.out.println(res[i]);
	}
}
}