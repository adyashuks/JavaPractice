package output;

public class Test1 {
private static int i = 0;
private static int j = 0;
public int a,b;
 
	Test1(int a1, int b1) {
	 this.a= a1;
	 this.b =b1;
 }


public static void main(String[] args) {
//int i = 2;
//int k = 3;
//Test1 t = new Test1(i,k);
// {
//int j = 3;
// System.out.println("i + j is " + i + j);
// }
// k = i + j;
// System.out.println("k is " + k);
// System.out.println("j is " + j);
	Integer x = 3 + new Integer(5);
// int an = Integer.parseInt("1");
// System.out.println("i " + x);
	String s1 = "Welcome to Java";
	String s2 = s1;
	String s3 = new String("Welcome to Java");
	String s4 = "Welcome to Java";

System.out.println(s1.equals(s3));
 }
}