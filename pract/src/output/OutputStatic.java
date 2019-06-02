package output;

public class OutputStatic {
private int radius;
private static int n;
public static void main(String[] args) {
//	int radius;
	OutputStatic o1= new OutputStatic();
	OutputStatic o2= new OutputStatic();
	OutputStatic o3= new OutputStatic();
	o1.radius = 2;
	o2.radius = 3;
//	o3.radius = 4;
	o3.radius=o2.radius;
	n= 5;
	System.out.println(n);
	System.out.println(o1.radius);
	System.out.println(o2.radius);
	System.out.println(o2.radius);
	System.out.println(o3==o2);
}
}
