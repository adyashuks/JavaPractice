package exceptionhandling;

public class Test1 {
public static void main(String[] args) {
try {
int value = 30;
Object o = new Object();
Object d = o.toString();
Object n = null;
System.out.println("d : " +d);
System.out.println("n : " +n.toString());
if (value < 40)
throw new Exception("value is too small");
System.out.println("Hello Adya");
 }
catch (Exception ex) {
 ex.printStackTrace();
 }
 System.out.println("Continue after the catch block");
 }
//public String toString(Object o){
//	return "o" + o;
//}
}