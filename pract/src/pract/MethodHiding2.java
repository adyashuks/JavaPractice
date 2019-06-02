package pract;

public class MethodHiding2 extends MethodHiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MethodHiding2 m = new MethodHiding2();
		M1();
		int passing = 3;
		Receiving(passing);
		System.out.println("The value of passing is: " + passing);
		
		String s1 = "Adya"; 
		String s2 = "Adya"; 
		System.out.println("Equality = " + s1.equals(s2));
	}

	public static void Receiving(int var) {
		var = var + 2;
	}

	public static void M1() {
		System.out.println("M1 from child");
	}
}
// When you declare two static methods with same name and signature in both
// superclass and subclass then they hide each other i.e. a call to the method
// in the subclass will call the static method declared in that class and a call
// to the same method is superclass is resolved to the static method declared in
// the super class.
