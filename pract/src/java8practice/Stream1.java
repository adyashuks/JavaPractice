package java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream<Integer> s1= Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
//		s1.forEach(i-> System.out.print(i.toString()));
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 1; i< 10; i++){
            li.add(i);
		}
		Stream<Integer> s2 = li.stream().distinct();
		s2.forEach(i-> System.out.println(i));
	}
}
