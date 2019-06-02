package output;

public class Abstract1Impl extends Abstract1{
public static void main(String args[]) {
	Abstract1 a = new Abstract1Impl();
	System.out.println();
}

@Override
public void show() {
	// TODO Auto-generated method stub
	System.out.println("Inside impl");
}
}
