package pract;

public class Parent {
	 public void Parent() {
	        System.out.println("inside parent without arguments");
	    }
	 
	   public Parent() {
	        super(); // hidden call to Object's default constructor
	        System.out.println("inside parent's default constructor");
	    }
	   
	    public Parent(int a) {
	        System.out.println("inside parent with argument");
	    }
}
