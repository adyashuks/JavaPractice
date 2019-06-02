package output;

public class LCM {

	public static void main(String[] args) {
//15 = 5 x 3 and 25 = 5 x 5 , Union of all factors = 5 x 5 x 3
		
//		prime(7);
		System.out.println(lcm(5,19));
	}

//	public static void prime(int n) {
//		int count = 1;
//		int[] x = new int[n];
//		for(int i=2; i< n; i++) {
//			if(n%i == 0) {
//				count++;
//			}
//		}
//		if(count == 1) {
//			System.out.println("Prime num");
//		} else {
//			System.out.println("Not prime");
//		}
//	}
	public static int lcm(int a, int b) {
		int lar = Math.max(a, b); 
        int small = Math.min(a, b); 
        for (int i = lar; ; i += lar) { 
            if (i % small == 0) 
                return i; 
        } 
	}
}
