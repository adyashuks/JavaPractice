package output;

import java.util.Date;

class Test2 {
public static void main(String[] args) {
Student student = new Student();
//	Test2 t = new Test2();
//	t.x();
 System.out.println("name? " + student.name);
 System.out.println("age? " + student.age);
 System.out.println("isScienceMajor? " + student.isScienceMajor);
 System.out.println("gender? " + student.gender);
 
 }
}
class Student {
	 String name; // name has the default value null
	int age; // age has the default value 0
	boolean isScienceMajor; // isScienceMajor has default value false
	char gender; // gender has default value '\u0000'
	}