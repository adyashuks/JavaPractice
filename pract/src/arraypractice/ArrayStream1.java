package arraypractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream1 {
public static void main(String[] args) {
	int a[] = {1,2,3,4,4,5,5,6,7,8,8};
	IntStream a1 = Arrays.stream(a);
//	a1.forEach(i-> System.out.println(i));
	a1.distinct().forEach(i-> System.out.println(i));
}
}
