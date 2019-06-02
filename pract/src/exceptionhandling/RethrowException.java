package exceptionhandling;

public class RethrowException {

	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("input = " + input);
		}
		catch(ArrayIndexOutOfBoundsException e) {
//			e.getMessage();
//			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				System.out.println("I am in try inside finally");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
