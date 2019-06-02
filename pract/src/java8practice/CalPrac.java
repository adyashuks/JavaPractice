package java8practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		System.out.println("Today = " + cal.getTime());
		DateFormat dateFormatToday = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = dateFormatToday.format(cal.getTime()); 
		System.out.println("Today = " +strDate);
//		cal.add(Calendar.DATE);
		cal.add(Calendar.DATE, -7);
		System.out.println("Date = "+ cal.getTime());
//		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00");  
		String strDate1 = dateFormat.format(cal.getTime()); 
		System.out.println("Previous = " +strDate1);
	}

}
