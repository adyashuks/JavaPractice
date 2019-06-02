package pract;

public class Fcatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fact(4);
	}

	public static void fact(int n) {
		int f = 1;
		if (n == 1) {
			System.out.println("Fact = " + n);
		} else {
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			System.out.println("Fact = " + f);
		}
	}
}
// 5 ! = 5* 4* 3*2*1