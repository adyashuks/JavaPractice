package output;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(13);

	}

	public static void prime(int n) {
		int count = 1, res =0;
		int[] x = new int[n];
		for(int i=2; i< n; i++) {
			if(n%i == 0) {
				count++;
				} 
		}
		if(count == 1) {
			System.out.println("Prime num");
			res = res + n;
			System.out.println(res);
		}
//		if(count == 1) {
//			System.out.println("Prime num sum " + res);
////			res = res + n;
//		} else {
//			System.out.println("Not prime");
//		}
//		for(int i =0 ; i< n; i++) {
//			System.out.println(x);
//		}
	}
}
