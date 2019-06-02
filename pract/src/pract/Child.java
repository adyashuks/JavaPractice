package pract;

public class Child extends Parent {
	
	public void Child() {
		System.out.println("inside child without arguments");
	}

	public Child() {
		super();
		System.out.println("default inside child");
	}
	
	public Child(int b) {
		System.out.println("inside child with argument");
	}
 
	public static void main(String[] args) {
		Parent a = new Child();
		System.out.println("a= "+a.toString());
		Parent p = new Child();
		Child child1 = new Child(15);
	}
}
