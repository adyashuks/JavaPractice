package output;

import java.util.ArrayList;
import java.util.List;

public class CalculateLength {

	public static void main(String[] args) {
		List<Integer> li1= new ArrayList<>();
		li1.add(1);
		li1.add(2);
		getCount(li1);
		List<Integer> li2= new ArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		getCount(li2);
	}

	public static int getCount(List list) {
		System.out.println("LEngth = " + list.size());
		return list.size();
	}
}
