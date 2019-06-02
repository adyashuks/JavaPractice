package output;

public abstract class Abstract1 {
	public static void main(String args[]) {
		Abstract1 i = new Abstract1() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("helloosssssssss");
			}
		};
	}
	public abstract void show();
	public void disp() {
		System.out.println("Abstract 1 disp()");
	}
}
