package output;

public class OddnEven {

	public static void main(String[] args) {
		int n= 1234566789;
		sum(n);
	}
	public static void sum(int  n) {
		int even = 0, odd=0;
		while(n!= 0) {
			int num = n;
			num = n%10;
			n=n/10;
			if(num%2 == 0) {
				even += num;
			}
			else {
				odd +=num;
			}
		}
		System.out.println("Even sum = " +even);
		System.out.println("Odd sum = " +odd);
	}
}
