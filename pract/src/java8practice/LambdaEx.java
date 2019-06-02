package java8practice;

public class LambdaEx {

	public static void main(String args[]) {
//	myLambda greet = ()-> System.out.println("Hello Adya");
//	greet.a();
	myLambda2 doubleNumber = (int n) ->  System.out.println(n*2);
	doubleNumber.b(5);
	lamb3.greet("Adya");
//	
//	lamb3 l = (a,b ) -> System.out.println(a+b);
//	l.meth("Adya ", "Shukla");
//	l.methi();
	}	
}

interface myLambda {
	void a();
}

interface myLambda2{
	void b(int n);
}

@FunctionalInterface
interface lamb3 {
	void meth(String a, String b);
	public default void methi() {
		System.out.println("I am default");
	}
	static String greet(String msg) {
		System.out.println("hello " + msg);
		return "hello " + msg;
	}
}