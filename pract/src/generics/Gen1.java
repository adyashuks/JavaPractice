package generics;

import java.util.ArrayList;
import java.util.Date;

public class Gen1 {

	public static void main(String[] args) {

		ArrayList<Date> a = new ArrayList<>();
		a.add(new Date());
//		a.add(new String());
		System.out.println(a);
	}

}
