package output;

import java.time.LocalDate;
import java.time.Month;

public class Pranshu {

	public static void main(String[] args) {
//		LocalDate date = LocalDate.now(); 
//		String d = date .toString();
//	    String s= "2019-04-12".equals(d) ? "Happy Birthday Broogle :)"
//	    		: "Better luck next time :p";
//	    System.out.println(s);
		
		LocalDate date = LocalDate.now(); 
		int initcount = 1000, finalcount =50000;
		Month month = date.getMonth(); 
	    int day = date.getDayOfMonth(); 
	    System.out.println("Month =" + month + " Day = " + day);
		for(int i=initcount; i<finalcount; i++) {
			System.out.println("Baar baar " + day + " " + month + " ae " + 
			"Baar baar dil ye gaae, tum jio "+ " " 	+ initcount + " Saal " +
			" Saal k din ho " + finalcount);
		}
	}
}
