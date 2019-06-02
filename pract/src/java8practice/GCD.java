package java8practice;

public class GCD {

	public static void main(String[] args) {
		// Java 7
//		cal(15,60);

		calGCD calculation = (num1,num2) -> {
			int div = (num1> num2) ?  num2 : num1;
			while(num1%div != 0 || num2%div != 0) {
				div--;
			}
			System.out.println("GCD IS : "  +div);
		};
		calculation.calculate(4, 10);
	}
	
//	public static void cal(int n1, int n2) {
//		int div = 0;
//		if(n1 > n2)
//			div = n2;
//		if(n2> n1)
//			div = n1;
//		
//		while(n1 % div != 0 || n2%div != 0) {
//			div--;
//		}
//		System.out.println("GCD is = "+ div);
//	}
}

interface calGCD {
	public void calculate(int number1, int number2);
}