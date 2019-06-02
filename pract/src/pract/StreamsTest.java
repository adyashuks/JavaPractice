package pract;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class StreamsTest {

	public static void main(String args[]) {
//		List<String> li = new ArrayList<String>();
		double[] numbers = {55, 29, 68, 21, 48, 36,   92,  56,  88,  96};
		Arrays.stream(numbers).forEach(i -> System.out.println(i));
	}
}
